<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

</head>
<body style="height: 80vh">
	<div class="bg-light mt-5 container shadow-lg p-5 mb-5 rounded-phill">
		<%@ include file="Navbar.jsp"%>
		<h1 class="text-center display-4 mt-5 text-warning">Cadastro De
			Livros</h1>
		<form class="" action="../bookServlet" method="post"
			class="container mt-5">
			<input type="hidden" value="<%=request.getParameter("url")%>"
				name="url">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label fw-bold">Nome
					Do Livro</label> <input name="name" type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label fw-bold">Autor
					Do Livro</label> <input name="author" type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-lg col-3 mt-4 btn-primary">Cadastrar</button>
			</div>
		</form>
	</div>
</body>
</html>