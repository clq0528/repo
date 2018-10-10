package com.java456.common;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java456.common.Env;
import com.java456.util.PropertiesUtil;
//import cn.wo.read.common.util.RedisOperUtils;

public class WebConfigListener implements ServletContextListener {
	private final static Logger logger = LoggerFactory.getLogger(WebConfigListener.class);
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		Properties properties = new Properties();
		try {
			String path = (getClass().getClassLoader().getResource("/").toURI()).getPath();
			String config = PropertiesUtil.getConfigfile();
			logger.debug("load config file:{}", config);
			FileInputStream fis = new FileInputStream(path + config);
			properties.load(fis);
		} catch (Exception e) {
			logger.error("加载系统参数配置异常", e);
		}
/*		Env.setRedisHost(properties.getProperty("REDIS_HOST"));
		Env.setRestHost(properties.getProperty("REST_HOST"));*/
		/*Env.setEncodingAesKey(properties.getProperty("ENCODING_AES_KEY"));
		Env.setTOKEN(properties.getProperty("TOKEN"));
		Env.setSuiteSecret(properties.getProperty("SUITE_SECRET"));
		
		//支付参数
/*		Env.setALIPAY_KEY(properties.getProperty("alipay.partner_key"));
		Env.setALIPAY_PID(properties.getProperty("alipay.partner_id"));
		Env.setALIPAY_PRIVATE_RSA(properties.getProperty("alipay.private_rsa"));
		Env.setALIPAY_PUBLIC_RSA(properties.getProperty("alipay.alipay_public_rsa"));
		Env.setALIPAY_RESULT_URL(properties.getProperty("alipay.result_url"));*/
/*		try{
        	if(null!=Env.getREDIS_HOST()){
        		String[] redisHostsArray = Env.getREDIS_HOST().split(",");
            	RedisOperUtils.initialPool(redisHostsArray);
        	}
        }catch(Exception ex){
        	logger.error("Redis 初始化异常", ex);
        }*/
	}

	@Override
	public void contextDestroyed(javax.servlet.ServletContextEvent arg0) {
		return;
	}
}
