package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lmj
 * @email lmj@gmail.com
 * @date 2021-05-24 14:15:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
