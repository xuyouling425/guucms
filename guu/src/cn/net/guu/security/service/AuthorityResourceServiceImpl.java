package cn.net.guu.security.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.net.guu.core.mapper.MapperFactory;
import cn.net.guu.core.service.ServiceFactoryImpl;
import cn.net.guu.security.mapper.AuthorityResourceMapper;


/**
 * Ȩ�޷��ʵ���Դ ����
 *
 * @author xrz
 * @date 2013-12-11 ����12:14:29
 */

@Service
@Scope("prototype")
public class AuthorityResourceServiceImpl extends ServiceFactoryImpl {

	@Resource
	private AuthorityResourceMapper authorityResourceMapper;

	public void setAuthorityResourceMapper(
			AuthorityResourceMapper authorityResourceMapper) {
		
		super.setMapper(authorityResourceMapper);
		super.setMapperXmlPath(AuthorityResourceMapper.class.getName());
		this.authorityResourceMapper = authorityResourceMapper;
	}
		
}
