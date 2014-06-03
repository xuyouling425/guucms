package cn.net.guu.spring;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;



/**
 * 静态化spring上下文工具类
 * 
 * @author yangxiansen
 * @date 2013-3-5 上午11:53:36
 * @Description
 */
@Service
public class SpringUtil implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		System.out.println(".....guu applicationContext init success....");
		applicationContext = ac;
	}

	/**
	 * 得到spring上下文对象
	 * 
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 得到spring注入的bean实例
	 * 
	 * @param beanName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanName) {
		return (T) applicationContext.getBean(beanName);
	}
	

}
