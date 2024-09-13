package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SucaitougaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SucaitougaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SucaitougaoView;


/**
 * 素材投稿
 *
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public interface SucaitougaoService extends IService<SucaitougaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SucaitougaoVO> selectListVO(Wrapper<SucaitougaoEntity> wrapper);
   	
   	SucaitougaoVO selectVO(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
   	
   	List<SucaitougaoView> selectListView(Wrapper<SucaitougaoEntity> wrapper);
   	
   	SucaitougaoView selectView(@Param("ew") Wrapper<SucaitougaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SucaitougaoEntity> wrapper);
   	
}

