package com.lon.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**  

* <p>Title: EurekaServer7001_App.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月20日 下午11:29:08 

* @version 1.0  

*/
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7003_App {
	
	public static void main(String[] args){
		SpringApplication.run(EurekaServer7003_App.class, args);
	}

}
