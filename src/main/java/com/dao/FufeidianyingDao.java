package com.dao;

import com.entity.FufeidianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FufeidianyingVO;
import com.entity.view.FufeidianyingView;


/**
 * 付费电影
 * 
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public interface FufeidianyingDao extends BaseMapper<FufeidianyingEntity> {
	
	List<FufeidianyingVO> selectListVO(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
	
	FufeidianyingVO selectVO(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
	
	List<FufeidianyingView> selectListView(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);

	List<FufeidianyingView> selectListView(Pagination page,@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
	
	FufeidianyingView selectView(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
	
}
