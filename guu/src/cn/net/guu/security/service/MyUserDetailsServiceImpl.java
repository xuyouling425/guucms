package cn.net.guu.security.service;

import java.sql.SQLException;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cn.net.guu.security.MyUserDetailsService;
import cn.net.guu.security.model.User;

@Service
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

	
	private UserServiceImpl userServiceImpl;	

	@Resource
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	


	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}



	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException,DataAccessException {
		// TODO Auto-generated method stub
		
		Collection<GrantedAuthority> auths = userServiceImpl.loadUserAuthoritiesByName(userName);
		User user = null;		
		try {
			
			 user = userServiceImpl.selUserByName(userName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new User(user.getUsername(), user.getPassword(), true, true, true, true, auths);
		
	}

}
