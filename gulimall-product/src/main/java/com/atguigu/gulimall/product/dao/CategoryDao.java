package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lmj
 * @email lmj@gmail.com
 * @date 2021-05-24 10:45:49
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
