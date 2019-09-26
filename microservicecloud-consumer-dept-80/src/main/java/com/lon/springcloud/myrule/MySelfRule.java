package com.lon.springcloud.myrule;
/**  

* <p>Title: MySelfRule.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: null</p>  

* @author lilongcheng  

* @date 2019年8月25日 下午6:47:55 

* @version 1.0  

*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
 
@Configuration
public class MySelfRule
{
  @Bean
  public IRule myRule()
  {
   return new RandomRule();//Ribbon默认是轮询，我自定义为随机
  }
}
 