package com.lon.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lon.springcloud.entities.Dept;

/**  

* <p>Title: DeptClientService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月25日 下午7:31:23 

* @version 1.0  

*/
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	 
	  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	  public Dept get(@PathVariable("id") long id);
	 
	  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	  public List<Dept> list();
	 
	  @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	  public boolean add(Dept dept);
}
