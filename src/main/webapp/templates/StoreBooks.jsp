<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page import="br.com.models.Book"%>
	<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body class="bg-white" >
	<%@ include file = "/templates/Navbar.jsp" %>
	<h4 class="display-4 my-5 text-center text-warning">Lista de Livros Cadastrados </h4>
	<table class="table table-dark table-striped container">
  		<thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NOME DO LIVRO</th>
      <th scope="col">ESCRITOR</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${list}" var="livro">	
	    <tr>
	      <th scope="row">${livro.id}</th>
	      <td>${livro.title}</td>
	      <td>${livro.author}</td>
	    </tr>	
		</c:forEach>
  </tbody>
	</table>
</body>
</html>