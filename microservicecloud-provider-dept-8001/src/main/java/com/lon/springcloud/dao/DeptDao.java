package com.lon.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lon.springcloud.entities.Dept;

/**  

* <p>Title: DeptDao.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月12日 下午11:34:58 

* @version 1.0  

*/
@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);
	
	public Dept findById(Long id);
	
	public List<Dept> findAll();
}
