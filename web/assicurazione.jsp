<%-- 
    Document   : assicurazione
    Created on : 11-mag-2018, 12.05.32
    Author     : web4e
--%>


<%@page import="utilis.Util"%>
<%@page import="entities.Utente"%>

<%

    Object userObj = session.getAttribute("utente");
    if (userObj == null) {
        response.sendRedirect("login.jsp");
    }
    Utente utente = (Utente) userObj;
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container">
            <div class="card-deck mb-3 text-center" style="width:33%; margin:auto;">

                <div class="card mb-4 box-shadow">
                    <div class="card-header">
                        <h4 class="my-0 font-weight-normal">Calcola costi assicurativi</h4>
                    </div>
                    <div class="card-body"> 
                        <h1 class="card-title pricing-card-title">€<%= Util.printDefault(session.getAttribute("importo"), "0") %> <small class="text-muted">/ y</small></h1>
                        <form action="assicurazione">
                            <select class="form-control" name="classe">
                                <% for (int i = 1; i <= 18; i++) {%>
                                    <option name="classe" value="<%=i%>"><%=i%></option>                       
                                <% } %>
                            </select>
                            <select class="form-control" name="eta">
                                <% for (int i = 16; i <= 80; i++) {%>
                                    <option name="eta" value="<%=i%>"><%=i%></option>                       
                                <% }%>
                            </select>
                            <button type="submit" class="btn btn-lg btn-block btn-primary">Calcola</button>
                        </form>
                        
                        <br>
                        <form method="GET" action="login">
                            <input type="hidden" name="action" value="logout">
                            <button type="submit" class="btn btn-block">Logout</button>
                        </form> 
                    </div>
                </div> 

            </div>

            <script src="js/bootstrap.min.js"></script>
    </body>
</html>
