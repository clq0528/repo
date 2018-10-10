/**
 * 
 */
package com.java456.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * <p><b>文件名称：</b>SpringContext.java
 * <p><b>文件描述：</b>spring上下文注入,以便静态工具类使用spring受管对象
 * <p><b>版权声明：</b>Copyright (C) 2016 Iread.Wo.Com.Cn All Rights Reserved.
 * <P><b>版本履历：</b>
 * <ul>
 * <li>2016年11月24日， YangBing ，1.0.0，新建
 * </ul>
 * <p>
 * @version 1.0.0
 * @author YangBing
 */
public class SpringContext implements ServletContextListener {
	private static final Logger	log	= LoggerFactory.getLogger(SpringContext.class);
	
	private static WebApplicationContext context;

	public SpringContext() {
		super();
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		context = WebApplicationContextUtils.getWebApplicationContext(sce
				.getServletContext());
		// 触发加载系统缓存写入redis
		log.info("触发加载redis系统缓存");
//		SysCacheOperator.refreshCache();
		//DdProductService ddProductService = (DdProductService)context.getBean("ddProductService");
    	//ddProductService.saveAllProductToRedies();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	public static ApplicationContext getContext() {
		return context;
	}
	
	 public static Object getBean(String name) throws BeansException {  
        return context.getBean(name);  
    }  

}
