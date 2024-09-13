package com.dao;

import com.entity.DianyingziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingziyuanVO;
import com.entity.view.DianyingziyuanView;


/**
 * 电影资源
 * 
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public interface DianyingziyuanDao extends BaseMapper<DianyingziyuanEntity> {
	
	List<DianyingziyuanVO> selectListVO(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
	
	DianyingziyuanVO selectVO(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
	
	List<DianyingziyuanView> selectListView(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);

	List<DianyingziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
	
	DianyingziyuanView selectView(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
	
}
