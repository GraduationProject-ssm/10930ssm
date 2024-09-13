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


import com.dao.DianyingziyuanDao;
import com.entity.DianyingziyuanEntity;
import com.service.DianyingziyuanService;
import com.entity.vo.DianyingziyuanVO;
import com.entity.view.DianyingziyuanView;

@Service("dianyingziyuanService")
public class DianyingziyuanServiceImpl extends ServiceImpl<DianyingziyuanDao, DianyingziyuanEntity> implements DianyingziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyingziyuanEntity> page = this.selectPage(
                new Query<DianyingziyuanEntity>(params).getPage(),
                new EntityWrapper<DianyingziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyingziyuanEntity> wrapper) {
		  Page<DianyingziyuanView> page =new Query<DianyingziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyingziyuanVO> selectListVO(Wrapper<DianyingziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyingziyuanVO selectVO(Wrapper<DianyingziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyingziyuanView> selectListView(Wrapper<DianyingziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyingziyuanView selectView(Wrapper<DianyingziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
