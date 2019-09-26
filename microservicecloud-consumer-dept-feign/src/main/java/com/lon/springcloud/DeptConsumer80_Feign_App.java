package com.lon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


/**  

* <p>Title: DeptConsumer80_App.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月14日 下午11:05:45 

* @version 1.0  

*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lon.springcloud"})
@ComponentScan("com.lon.springcloud")
public class DeptConsumer80_Feign_App {
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}

}
