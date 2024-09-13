package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyingziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingziyuanView;


/**
 * 电影资源
 *
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public interface DianyingziyuanService extends IService<DianyingziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingziyuanVO> selectListVO(Wrapper<DianyingziyuanEntity> wrapper);
   	
   	DianyingziyuanVO selectVO(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
   	
   	List<DianyingziyuanView> selectListView(Wrapper<DianyingziyuanEntity> wrapper);
   	
   	DianyingziyuanView selectView(@Param("ew") Wrapper<DianyingziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingziyuanEntity> wrapper);
   	
}

