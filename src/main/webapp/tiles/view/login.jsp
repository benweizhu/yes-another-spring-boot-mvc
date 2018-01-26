<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url var="actionUrl" value="/login"/>

<h2 style="font-weight: normal">用户登录:</h2>
<form action="${actionUrl}" method="post" id="login-form">
    <div class="form-group">
        <label for="username" style="font-weight: normal">用户名:</label>
        <input type="text" id="username" class="form-control" name="username"/>
    </div>
    <div class="form-group">
        <label for="password" style="font-weight: normal">密码:</label>
        <input type="password" id="password" class="form-control" name="password"/>
    </div>
    <div class="form-group">
        <label for="remember-me" style="font-weight: normal">记住我:</label>
        <input id="remember-me" type="checkbox" name="remember-me"/>
    </div>
    <button name="submit" class="btn btn-default">登录</button>

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>



