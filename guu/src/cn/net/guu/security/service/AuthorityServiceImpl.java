package cn.net.guu.security.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.net.guu.core.mapper.MapperFactory;
import cn.net.guu.core.service.ServiceFactoryImpl;
import cn.net.guu.security.mapper.AuthorityMapper;
import cn.net.guu.security.model.Authority;
import cn.net.guu.security.model.AuthorityResource;
import cn.net.guu.spring.SpringUtil;

/**
 * Ȩ�޽ӿ�
 *
 * @author xrz
 * @date 2013-12-10 ����9:48:58
 */


@Scope("prototype")
@Service
public class AuthorityServiceImpl extends ServiceFactoryImpl {

	protected AuthorityMapper authorityMapper;		

	public AuthorityMapper getAuthorityMapper() {
		return authorityMapper;
	}

	@Resource()
	public void setAuthorityMapper(AuthorityMapper authorityMapper) {
		//System.out.println("=======AuthorityServiceImpl====111111111======");
		super.setMapper(authorityMapper);
		super.setMapperXmlPath(AuthorityMapper.class.getName());
		this.authorityMapper = authorityMapper;
	}

	
	public List<Authority> selAllAuthoryList() throws SQLException
	{
		return (List<Authority>) authorityMapper.selectByExample(null);
	}
	
}
