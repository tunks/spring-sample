package dev.sample.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoService implements InitializingBean{	
	private static Logger logger = LoggerFactory.getLogger(DemoService.class.getName());
	
	@Override
	public void afterPropertiesSet() throws Exception {
         logger.info(" Bean initialized ......");
	}
	
}
