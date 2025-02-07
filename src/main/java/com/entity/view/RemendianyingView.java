package com.entity.view;

import com.entity.RemendianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门电影
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
@TableName("remendianying")
public class RemendianyingView  extends RemendianyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemendianyingView(){
	}
 
 	public RemendianyingView(RemendianyingEntity remendianyingEntity){
 	try {
			BeanUtils.copyProperties(this, remendianyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
