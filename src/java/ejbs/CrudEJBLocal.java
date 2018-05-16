package ejbs;

import beans.UtenteBean;
import entities.Utente;
import javax.ejb.Local;

@Local
public interface CrudEJBLocal {
    
    public boolean registerUser(UtenteBean u);
    
    public Utente loginUser(String email, String password);
    
}
