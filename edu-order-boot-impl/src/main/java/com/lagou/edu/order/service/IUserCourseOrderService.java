package com.lagou.edu.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lagou.edu.order.client.dto.CreateShopGoodsOrderReqDTO;
import com.lagou.edu.order.client.dto.UserCourseOrderDTO;
import com.lagou.edu.order.client.dto.UserCourseOrderResDTO;
import com.lagou.edu.order.entity.UserCourseOrder;

import java.util.List;

/**
 * @author: ma wei long
 * @date:   2020年6月17日 上午11:43:48
*/
public interface IUserCourseOrderService extends IService<UserCourseOrder>{
	/**
	 * @Description: (创建商品订单)
	 * @author: ma wei long
	 * @date:   2020年6月19日 上午10:43:26   
	*/
	UserCourseOrderResDTO saveOrder(CreateShopGoodsOrderReqDTO reqDTO);
	
	/**
	 * @Description: (根据订单号获取订单信息)   
	 * @author: ma wei long
	 * @date:   2020年6月19日 上午11:31:59   
	*/
	UserCourseOrderDTO getCourseOrderByOrderNo(String orderNo);
    
    /**
	 * @Description: (更新商品订单状态)   
	 * @author: ma wei long
	 * @date:   2020年6月21日 下午11:15:18   
	*/
    void updateOrderStatus(String orderNo,Integer status);
    
    /**
     * @Description: (保存订单信息)   
     * @author: ma wei long
     * @date:   2020年6月21日 下午11:44:42   
    */
    void saveOrder(UserCourseOrder order);
    
    /**
     * @Description: (根据用户id获取订单列表)   
     * @author: ma wei long
     * @date:   2020年6月22日 下午8:27:22   
    */
    List<UserCourseOrderDTO> getUserCourseOrderByUserId(Integer userId);
    
    /**
     * @Description: (根据用户&课程id统计订单数量)   
     * @author: ma wei long
     * @date:   2020年6月23日 下午1:16:18   
    */
    Integer countUserCourseOrderByCoursIds(Integer userId,List<Integer> coursIds);
    
    /**
	 * @Description: (根据课程id统计支付成功订单数量)   
	 * @author: ma wei long
	 * @date:   2020年6月29日 上午11:28:05   
	*/
    Integer countUserCourseOrderByCourseId(Integer coursId);
    
    /**
	 * @Description: (根据课程id查询支付成功订单集合)   
	 * @author: ma wei long
	 * @date:   2020年6月30日 上午10:40:47   
	*/
    List<UserCourseOrderDTO> getOrderListByCourseId(Integer coursId);
}