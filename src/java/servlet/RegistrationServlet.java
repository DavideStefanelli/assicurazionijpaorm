package servlet;

import beans.UtenteBean;
import java.io.IOException; 
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ejbs.CrudEJBLocal;

public class RegistrationServlet extends HttpServlet {
  
    @EJB
    CrudEJBLocal crudEjb;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            UtenteBean u = new UtenteBean(
                    request.getParameter("email"),
                    request.getParameter("nome"),
                    request.getParameter("cognome"),
                    request.getParameter("password"),
                    request.getParameter("cf"),
                    new java.sql.Date(new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("datanascita")).getTime()),
                    request.getParameter("sesso")
            );
            crudEjb.registerUser(u);
        } catch (ParseException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        response.sendRedirect("login.jsp");
        
    }
  
}
