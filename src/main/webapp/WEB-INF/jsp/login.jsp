
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H3>登陆页面</H3>
<form action="${pageContext.request.contextPath}/securityLogin" method="post">
    用户名：<input type="text" name="username"/><br/>
    密  码：<input type="text" name="password"/><br/>
    <input type="submit" value="登陆">
</form>
</body>
</html>
