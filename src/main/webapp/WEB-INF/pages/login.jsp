<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login page</title>
		<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"/>
		<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"/>
		<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
	</head>

	<body>
		<div id="mainWrapper">
			<div class="login-container" style="border-radius: 10px;">
				<div class="login-card">
					<div>
						<h3>Добро пожаловать в систему регистрации заявлений о неправильной парковке транспортных средств.</h3>
						<br>
						<h4>Для продолжения работы с системой необходимо авторизоваться:</h4>
					</div>
					<div class="login-form">
						<c:url var="loginUrl" value="/login" />
						<form action="${loginUrl}" method="post" class="form-horizontal">
							<c:if test="${param.error != null}">
								<div class="alert alert-danger">
									<p>Неправильные имя и/или пароль</p>
								</div>
							</c:if>
							<c:if test="${param.logout != null}">
								<div class="alert alert-success">
									<p>Вы успешно вышли из аккаунта</p>
								</div>
							</c:if>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
								<input type="text" class="form-control" id="username" name="login" placeholder="Введите имя" required>
							</div>
							<div class="input-group input-sm">
								<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
								<input type="password" class="form-control" id="password" name="password" placeholder="Введите пароль" required>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />

							<div class="form-actions">
								<input type="submit"
									class="btn btn-block btn-primary btn-default" value="Войти">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>