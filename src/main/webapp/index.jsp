<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Initial</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
	<body class="">
	<form action="ServletLogin" class=" border ronded-circle border-5  container bg-light mt-5 col-3 p-5" method="post">
	<input type="hidden" value="<%=request.getParameter("url")%>" name="url">
  <fieldset >
    <legend class="text-center text-warning display-5">Login</legend>
    <div class="mb-3">
      <label for="disabledTextInput" class="form-label mt-5">Login</label>
      <input type="text" name="login" id="disabledTextInput" class="col-3 form-control " placeholder="Disabled input">
    </div>
    <div class="mb-3">
      <label for="disabledSelect" class="form-label">Password</label>
       <input type="text" name="password" id="disabledTextInput" class="form-control" placeholder="Disabled input">
    </div>
    <div class="text-center" >
    	<button type="submit" class="btn btn-lg btn-primary">Logar</button>
    </div>
  </fieldset>
</form>
<h4 class="text-center text-danger">${msg}</h4>
</body>
</body>
</html>