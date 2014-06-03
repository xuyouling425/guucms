<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="test/register.do" id="reg" name="reg" method=post>&nbsp;  
   		userName:<input type="text" id="name" name="userName"><br/>
   		password:<input type="text" id="password" name="password"><br/>
   		age:<input type="text" id="age" name="userAge"><br/>
   		email:<input type="text" id="email" name="email"><br/>
   		userBirthday <input type="text" id="bir" name="userBirthday"> </br>
   		<input type="submit" id="sub" name="sub" value="提交">
   </form>
  </body>
</html>
