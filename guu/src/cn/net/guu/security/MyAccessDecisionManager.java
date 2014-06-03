package cn.net.guu.security;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class MyAccessDecisionManager implements AccessDecisionManager {

	@Override
	public void decide(Authentication authentication, Object object,
			Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		// TODO Auto-generated method stub
		
		

		if (configAttributes == null) {  
            return;  
        }  
		System.out.println("dddddddddddddddddddddddd"+object.toString());
        // object is a URL.  
        Iterator<ConfigAttribute> ite = configAttributes.iterator();  
        
        
      
        while (ite.hasNext()) {  
            ConfigAttribute ca = ite.next();  
            //System.out.println(ca);
            String needRole = ((SecurityConfig) ca).getAttribute(); 
            //String needRole = ((SecurityConfig) ca).getAttribute(); 
            //System.out.println(""+);
            System.out.println("页面的权限必须："+needRole.trim());
            
            for (GrantedAuthority ga : authentication.getAuthorities()) {
            	System.out.println("你的权限为："+ga.getAuthority().trim());
                if(needRole.trim().equals(ga.getAuthority().trim()))
                {
                	//System.out.println("good");
                	return;
                }else
                {
                	//System.out.println("bad");
                }
            }
            
            
        }  
        //  
        //System.out.println("ddddddddddddddddddddddddddd2-false");
        //throw new InsufficientAuthenticationException("no right!");
        throw new AccessDeniedException("no right!");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}

}
