package ejbs;

import beans.UtenteBean;
import entities.Utente;
import java.util.concurrent.ThreadLocalRandom;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.apache.commons.codec.digest.DigestUtils;
 
@Stateful
public class CrudEJB implements CrudEJBLocal {
    
    @PersistenceContext(unitName = "AssicurazioniJpaOrmPU")
    EntityManager em;
    
    @Override
    public boolean registerUser(UtenteBean uBean){
        String sale = Long.toUnsignedString(ThreadLocalRandom.current().nextLong());
        
        String passwordHash = DigestUtils.sha256Hex(uBean.getPassword() + sale);
        
        Utente utente = new Utente(
            uBean.getEmail(),
            uBean.getCf(),
            uBean.getNome(),
            uBean.getCognome(),
            uBean.getDatanascita(),
            passwordHash,
            sale,
            uBean.getSesso().charAt(0)
        );
        
        em.persist(utente); 

        return em.contains(utente);
    }

    @Override
    public Utente loginUser(String email, String password) {
     
        TypedQuery<Utente> utenti = 
                em.createNamedQuery("Utente.findByEmail", Utente.class)
                .setParameter("email", email);
        
        if(!utenti.getResultList().isEmpty()){
            
            Utente u = utenti.getResultList().get(0); 
            String passwordHash = DigestUtils.sha256Hex(password + u.getSale()); 
            
            if(u.getPassword().equals(passwordHash)){
                return u;
            }
            
        }
        return null;
    }
    
    
    
}
