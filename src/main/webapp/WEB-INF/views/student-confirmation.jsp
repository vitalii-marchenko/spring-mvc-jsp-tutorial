<%--
  Created by IntelliJ IDEA.
  User: vmarchenko
  Date: 05.04.20
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Student Confirmation</title>
    </head>
    <body>

        The student is confirmed: ${student.firstName} ${student.lastName}

        <br><br>

        Country: ${student.country}

        <br><br>

        Your favorite programming language: ${student.favoriteLanguage}

    </body>
</html>
