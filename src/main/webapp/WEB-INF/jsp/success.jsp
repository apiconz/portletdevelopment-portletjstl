<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>

<%@ page contentType="text/html" isELIgnored="false"%>

<form action="<c:out value='${requestScope.registrarActionURL}'/>"
	method="POST">
	<input type="text" name="texto" /> <br /> <input type="submit"
		value="Enviar">
</form>