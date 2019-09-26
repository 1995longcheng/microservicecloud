package com.lon.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lon.springcloud.entities.Dept;
import com.lon.springcloud.service.DeptClientService;

/**  

* <p>Title: DeptController_Consumer.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月14日 下午10:55:59 

* @version 1.0  

*/
@RestController
public class DeptController_Consumer {
	//private static final String REST_URL_PREFIX  = "http://localhost:8001";
//	  private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
//	@Autowired
//	private RestTemplate restTemplate;

	  @Autowired
	  private DeptClientService service = null;
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept){
		//return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
		return this.service.add(dept);
	}
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
		  return this.service.get(id);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list(){
		//return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
		 return this.service.list();
	}
}
