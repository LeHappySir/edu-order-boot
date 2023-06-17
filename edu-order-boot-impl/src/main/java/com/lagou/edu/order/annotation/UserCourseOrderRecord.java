package com.lagou.edu.order.annotation;


import com.lagou.edu.order.client.enums.StatusTypeEnum;

import java.lang.annotation.*;

/**
 * @author: ma wei long
 * @date:   2020年6月21日 下午11:58:32
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserCourseOrderRecord {
	StatusTypeEnum type();
}