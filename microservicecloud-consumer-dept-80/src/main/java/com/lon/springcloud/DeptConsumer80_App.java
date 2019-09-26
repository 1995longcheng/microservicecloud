package com.lon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lon.springcloud.myrule.MySelfRule;

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
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_App {
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
