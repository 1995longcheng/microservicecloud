package com.lon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**  

* <p>Title: DeptProvider8001_App.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月13日 下午10:46:49 

* @version 1.0  

*/
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
public class DeptProvider8001_App {

	public static void main(String[] args){
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
