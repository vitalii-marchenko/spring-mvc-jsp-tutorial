<%--
  Created by IntelliJ IDEA.
  User: vmarchenko
  Date: 06.04.20
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Customer Confirmation</title>
    </head>
    <body>

        The customer is confirmed: ${customer.firstName} ${customer.lastName}

        <br><br>

        Number of free passes is: ${customer.freePasses}

        <br><br>

        Postal Code: ${customer.postalCode}

        <br><br>

        The Course Code: ${customer.courseCode}

    </body>
</html>
