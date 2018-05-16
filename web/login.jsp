<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    </head>

    <style> 
        
        .form-signin{
            max-width: 330px; 
            margin: auto;
        }
        
        .form-control {
            margin-bottom: .7vw;
        }
        
    </style>

    <body>

        <div class="container">
            <form class="form-signin" name="myForm" method="POST" action="login">
                <h2>Login</h2>
                <label for="inputUsername" class="sr-only">Nome Utente</label>
                <input type="email" id="inputUsername" class="form-control" name="email" placeholder="Email" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Password" required>
                
                <% 
                String status = request.getParameter("status");
                if (status != null && status.equals("fail")) { %>
                    <div class="alert alert-danger">
                        <strong>Errore!</strong> I dati inseriti non sono corretti
                    </div>
                <% } %> 
                
                <button class="btn btn-lg btn-primary btn-block" type="submit">Accedi</button>
                <a href="registrazione.jsp"> Registrazione </a>
            </form>

        </div>
        <script src="js/bootstrap.min.js"></script>    
    </body>


</html>