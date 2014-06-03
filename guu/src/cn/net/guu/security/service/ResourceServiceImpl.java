package cn.net.guu.security.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
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
import cn.net.guu.security.mapper.ResourceMapper;
import cn.net.guu.security.model.AuthorityResource;
import cn.net.guu.spring.SpringUtil;

/**
 * 
 *
 * @author xrz
 * @date 2013-12-11 ����12:24:54
 */

@Scope("prototype")
@Service
public class ResourceServiceImpl extends ServiceFactoryImpl {

	
	private ResourceMapper resourceMapper;	

	public ResourceMapper getResourceMapper() {
		return resourceMapper;
	}
	
	@Resource
	public void setResourceMapper(ResourceMapper resourceMapper) {
		super.setMapper(resourceMapper);
		super.setMapperXmlPath(ResourceMapper.class.getName());
		this.resourceMapper = resourceMapper;
	}


	    public List<cn.net.guu.security.model.Resource> selAuthResByAuthName(String authName)
	    {
	    	return resourceMapper.selectAuthResByAuthName(authName);
	    }
	
}
