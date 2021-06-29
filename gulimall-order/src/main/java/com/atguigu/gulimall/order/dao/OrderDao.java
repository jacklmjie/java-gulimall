package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lmj
 * @email lmj@gmail.com
 * @date 2021-05-24 16:15:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
