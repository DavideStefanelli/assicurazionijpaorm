/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import beans.UtenteBean;
import ejbs.CrudEJBLocal;
import entities.Utente;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author web4e
 */
public class LoginServlet extends HttpServlet {

    @EJB
    CrudEJBLocal crudEjb;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Utente utente = crudEjb.loginUser(request.getParameter("email"), request.getParameter("password"));

        if (utente != null) {
            HttpSession sessione = request.getSession();
            sessione.setAttribute("utente", utente);
            response.sendRedirect("assicurazione.jsp");

        } else {
            response.sendRedirect("login.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action"); 
        if (action.equals("logout")) { 
            request.getSession().invalidate();
            response.sendRedirect("login.jsp");
        }
    }

}
