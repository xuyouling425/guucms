package cn.net.guu.security.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import cn.net.guu.core.service.ServiceFactoryImpl;
import cn.net.guu.security.mapper.AuthorityMapper;
import cn.net.guu.security.mapper.UserMapper;
import cn.net.guu.security.model.Authority;
import cn.net.guu.security.model.User;
import cn.net.guu.security.model.UserExample;
import cn.net.guu.security.model.UserExample.Criteria;



@Scope("prototype")
@Service
public class UserServiceImpl extends ServiceFactoryImpl {

	
	public UserMapper userMapper;
	
	public AuthorityMapper authorityMapper;
	
	@Resource
	public void setUserMapper(UserMapper userMapper) {
		super.setMapper(userMapper);
		super.setMapperXmlPath(UserMapper.class.getName());
		this.userMapper = userMapper;
	}

	@Resource
	public void setAuthorityMapper(AuthorityMapper authorityMapper) {
		this.authorityMapper = authorityMapper;
	}




	public User selUserByName(String userName) throws SQLException
	{
		User user = null;	
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(userName);		
		List<User> userList = (List<User>) userMapper.selectByExample(null);
		if(null!=userList && userList.size()>0)
		{
			user = userList.get(0);
		}
		return user; 
	}

	
	public Collection<GrantedAuthority> loadUserAuthoritiesByName(String userName)
	{
		Collection<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		List<Authority> authoritieList = authorityMapper.selectByUserName(userName);
		
		for(Authority authority:authoritieList)
		{
			
			SimpleGrantedAuthority authorityImpl = new SimpleGrantedAuthority(authority.getAuthorityName());
			auths.add(authorityImpl);
		}
		
		return auths;
	}


}
