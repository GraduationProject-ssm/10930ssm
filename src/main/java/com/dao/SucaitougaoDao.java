package com.dao;

import com.entity.SucaitougaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SucaitougaoVO;
import com.entity.view.SucaitougaoView;


/**
 * 素材投稿
 * 
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public interface SucaitougaoDao extends BaseMapper<SucaitougaoEntity> {
	
	List<SucaitougaoVO> selectListVO(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
	
	SucaitougaoVO selectVO(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
	
	List<SucaitougaoView> selectListView(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);

	List<SucaitougaoView> selectListView(Pagination page,@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
	
	SucaitougaoView selectView(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
	
}
