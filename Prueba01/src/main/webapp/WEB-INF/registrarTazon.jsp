<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> <!-- nos permite trabajar con formularios -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de Taza</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<c:if test="${mensaje != null }">
			<c:out value="${mensaje}"></c:out>
		</c:if>
		<form:form action="/registrar/tazon" method="post" modelAttribute="tazon">
			
			<form:label path="nombre" >Nombre de taza: </form:label>
			<form:input path="nombre" class="form-control" for="nombre"/>
			<br>
			<br>
			<form:label path="color">Color: </form:label>
			<form:input path="color" class="form-control" for="color"/>
			<br>
			<br>
			<form:label path="altura">Altura: </form:label>
			<form:input type="number" class="form-control" path="altura" for="altura"/>
			<br>
			<br>
			<input type="submit" value="Guardar">
			</form:form>
	</div>
</body>
</html>