package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SucaitougaoDao;
import com.entity.SucaitougaoEntity;
import com.service.SucaitougaoService;
import com.entity.vo.SucaitougaoVO;
import com.entity.view.SucaitougaoView;

@Service("sucaitougaoService")
public class SucaitougaoServiceImpl extends ServiceImpl<SucaitougaoDao, SucaitougaoEntity> implements SucaitougaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SucaitougaoEntity> page = this.selectPage(
                new Query<SucaitougaoEntity>(params).getPage(),
                new EntityWrapper<SucaitougaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SucaitougaoEntity> wrapper) {
		  Page<SucaitougaoView> page =new Query<SucaitougaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SucaitougaoVO> selectListVO(Wrapper<SucaitougaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SucaitougaoVO selectVO(Wrapper<SucaitougaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SucaitougaoView> selectListView(Wrapper<SucaitougaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SucaitougaoView selectView(Wrapper<SucaitougaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
