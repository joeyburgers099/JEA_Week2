<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Hello World!!</h2>
<h2>${helloMessage}</h2>
<form action="sample.jsp" method="POST">
    <input type="text" id="firstname" name="firstname" />
    <input type="submit" value="Submit" />
</form>

</body>
</html>