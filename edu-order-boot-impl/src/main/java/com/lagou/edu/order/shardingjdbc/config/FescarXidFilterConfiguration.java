package com.lagou.edu.order.shardingjdbc.config;

import com.lagou.edu.order.advice.FescarXidFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ma wei long
 * @date:   2020年7月28日 上午12:32:49
 */
@Configuration
public class FescarXidFilterConfiguration {

	@Bean
	public FescarXidFilter fescarXidFilter(){
	    return new FescarXidFilter();
	}

}