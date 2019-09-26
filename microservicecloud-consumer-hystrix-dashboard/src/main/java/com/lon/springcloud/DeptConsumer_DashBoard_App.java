package com.lon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**  

* <p>Title: DeptConsumer_DashBoard_App.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年7月9日 下午11:28:55 

* @version 1.0  

*/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
	
	public static void main(String[] args){
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}

}
