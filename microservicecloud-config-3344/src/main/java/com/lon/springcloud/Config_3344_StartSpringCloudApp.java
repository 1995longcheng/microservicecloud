package com.lon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**  

* <p>Title: Config_3344_StartSpringCloudApp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年9月26日 下午10:53:02 

* @version 1.0  

*/
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
	public static void main(String[] args){
		SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
	}

}
