<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Registrazione</title>
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
            <form class="form-signin" name="myForm" method="POST" action="registration">
                <h2>Registrazione</h2>
                <label for="inputEmail" class="sr-only">Email</label>
                <input type="email" id="inputEmail" class="form-control" name="email" placeholder="Email" required autofocus>

                <label for="inputNome" class="sr-only">Nome</label>
                <input type="text" id="inputNome" class="form-control" name="nome" placeholder="Nome" required autofocus>

                <label for="inputCognome" class="sr-only">Cognome</label>
                <input type="text" id="inputCognome" class="form-control" name="cognome" placeholder="Cognome" required autofocus>

                <label for="codiceFiscale" class="sr-only">Codice Fiscale</label>
                <input type="text" id="codiceFiscale" class="form-control" name="cf" placeholder="Codice Fiscale" required autofocus>

                <label for="password" class="sr-only">Password</label>
                <input type="password" id="password" class="form-control" name="password" placeholder="Password" required autofocus>

                <label for="inputDataNascita" class="sr-only">Data di nascita</label> 
                <input type="date" id="inputDataNascita" name="datanascita" max="2100-12-31" min="1900-01-01" class="form-control" required>

                <label class="radio-inline">
                    <input type="radio" name="sesso" value="M">M
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sesso" value="F">F
                </label>

                <button class="btn btn-lg btn-primary btn-block" type="submit">Registrati</button>
                
                <a href="login.jsp"> Torna al login </a>
            </form>
        </div>

        <script src="js/bootstrap.min.js"></script>     
    </body>


</html>