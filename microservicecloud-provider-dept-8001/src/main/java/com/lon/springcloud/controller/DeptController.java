package com.lon.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lon.springcloud.entities.Dept;
import com.lon.springcloud.service.DeptService;

/**  

* <p>Title: DeptController.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月13日 上午12:04:47 

* @version 1.0  

*/
@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	@RequestMapping(value = "/dept/add", method=RequestMethod.POST)
	private boolean add(@RequestBody Dept dept)
	{
		return service.add(dept);
	}
	
	@RequestMapping(value="/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return service.list();
	}
	
	@RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id){
		return service.get(id);
	}
}
