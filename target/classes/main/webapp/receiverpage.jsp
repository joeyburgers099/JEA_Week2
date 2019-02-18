<%--
  Created by IntelliJ IDEA.
  User: Joey
  Date: 18-2-2019
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<% if (request.getParameter("firstname") == null) {
    out.println("Please enter your name.");
} else {
    out.println("Hello <b>"+request.getParameter("firstname")+"</b>!");
}
%>


</body>
</html>
