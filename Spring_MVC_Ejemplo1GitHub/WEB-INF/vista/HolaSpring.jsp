<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo.css">
</head>
<body>
	Hola ${param.nombreAlumno}, Bienvenido el Curso
<p>
<h2>Atencion a todos</h2>
${mensajeClaro}
</p>

<img alt="foto" src="${pageContext.request.contextPath}/recursos/imagenes/ImagenFondoUsuarios.jpg">

</body>
</html>