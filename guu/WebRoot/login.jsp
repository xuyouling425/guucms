<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    login<br>
    <form action="j_spring_security_check" method="post">    
        username:
    	<input type="text" name="j_username" id="username">                    
        <br>
        password:<input type="password" name="j_password" id="password">                
        <br>        
        <input type="submit" id="sub" name="sub" value="提交">
    </form>
</body>
</html>