package cn.net.guu.security.controller;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.net.guu.security.model.User;
import cn.net.guu.security.service.UserServiceImpl;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserCotroller {

	
	@Resource()
	public UserServiceImpl userServiceImpl;
	
	public String login()
	{
		 
		try {
			Object obj = new Object();
			userServiceImpl.add(obj);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/test")
	public String userTest()
	{
		
	 	try {
			List<User> userList = (List<User>) userServiceImpl.selectByExample(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "test";
	}
	
}
