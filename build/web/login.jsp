<%-- 
    Document   : login
    Created on : Jul 11, 2018, 8:43:40 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page!</h1>
        <form method="" action="LoginServlet">
        Username:<input type="text" name="username"><br><br>
        Password:<input type="password" name="password"><br><br>
        <input type="submit" name="login" value="Login">
        </form>
          <h1>OR</h1>
          <h3>
              <a href="signup.jsp">Signup</a>
              </h3>
            <h1>OR</h1>
            <h3>
                <a href="/UserListServlet.jsp">userList</a>
            </h3>
    </body>
</html>
