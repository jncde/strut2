<?xml version="1.0" encoding="GB18030" ?>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>

<% String context = request.getContextPath(); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030" />
<title>Insert title here</title>
</head>
<body>
取得Map类型request,session,application,真实类型 HttpServletRequest, HttpSession, ServletContext的引用:
<ol>
	<li>前三者：依赖于容器</li>
	<li>前三者：IOC</li> (只用这种)
	<li>后三者：依赖于容器</li>
	<li>后三者：IOC</li>
</ol>
<br />
<form name="f" action="" method="post">
用户名：<input type="text" name="name"/>
密码：<input type="text" name="password"/>
<br />
<input type="button" value="submit1" onclick="javascript:document.f.action='accessWebElements/login1';document.f.submit();" />
<input type="button" value="submit2" onclick="javascript:document.f.action='accessWebElements/login2';document.f.submit();" />
<input type="button" value="submit3" onclick="javascript:document.f.action='accessWebElements/login3';document.f.submit();" />
<input type="button" value="submit4" onclick="javascript:document.f.action='accessWebElements/login4';document.f.submit();" />
</form>
	
</body>
</html>