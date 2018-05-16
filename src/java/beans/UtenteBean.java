package beans;

import java.util.Date; 

public class UtenteBean {
    
    String email;
    String nome;
    String cognome;
    String password;
    String cf;
    Date datanascita;
    String sesso;

    public UtenteBean(String email, String nome, String cognome, String password, String cf, Date datanascita, String sesso) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.cf = cf;
        this.datanascita = datanascita;
        this.sesso = sesso;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public Date getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(Date datanascita) {
        this.datanascita = datanascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    
    
    
}
