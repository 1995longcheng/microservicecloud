package com.lon.springcloud.service;

import java.util.List;

import com.lon.springcloud.entities.Dept;

/**  

* <p>Title: DeptService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月12日 下午11:54:26 

* @version 1.0  

*/
public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
