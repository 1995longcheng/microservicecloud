package com.lon.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lon.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

/**  

* <p>Title: DeptClientServiceFallbackFactory.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月25日 下午11:10:49 

* @version 1.0  

*/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{

	@Override
	public DeptClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		 return new DeptClientService() {
		     @Override
		     public Dept get(long id)
		     {
		    	 Dept dept =  new Dept();
		    	 dept.setDeptno(id);
		    	 dept.setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
		    	 dept.setDb_source("no this database in MySQL");
		       return dept;
		     }
		 
		     @Override
		     public List<Dept> list()
		     {
		       return null;
		     }
		 
		     @Override
		     public boolean add(Dept dept)
		     {
		       return false;
		     }
		   };

	}

}
