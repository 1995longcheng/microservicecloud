package com.lon.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lon.springcloud.dao.DeptDao;
import com.lon.springcloud.entities.Dept;
import com.lon.springcloud.service.DeptService;

/**  

* <p>Title: DeptServiceImpl.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月12日 下午11:57:05 

* @version 1.0  

*/
@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	public DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
