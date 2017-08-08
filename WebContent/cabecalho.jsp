<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="user" class="br.com.fiap.bean.AcessoBean" scope="session">
	<jsp:setProperty name="user" property="user" />
</jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cabecalho</title>
</head>
<body>

	Primeiro Acesso ${user.primeiroAcesso} 
	<br/>
	Ultimo Acesso ${user.ultimoAcesso}
	
</body>
</html>