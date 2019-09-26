package com.lon.springcloud.entities;
/**  

* <p>Title: Dept.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月5日 下午11:47:14 

* @version 1.0  

*/

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

//@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	private Long deptno;
	private String dname;
	private String db_source;
	
	
	public Dept(String dname){
		super();
		this.dname = dname;
	}

}
