package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SucaitougaoEntity;
import com.entity.view.SucaitougaoView;

import com.service.SucaitougaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 素材投稿
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
@RestController
@RequestMapping("/sucaitougao")
public class SucaitougaoController {
    @Autowired
    private SucaitougaoService sucaitougaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SucaitougaoEntity sucaitougao, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			sucaitougao.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SucaitougaoEntity> ew = new EntityWrapper<SucaitougaoEntity>();
		PageUtils page = sucaitougaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sucaitougao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SucaitougaoEntity sucaitougao, HttpServletRequest request){
        EntityWrapper<SucaitougaoEntity> ew = new EntityWrapper<SucaitougaoEntity>();
		PageUtils page = sucaitougaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sucaitougao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SucaitougaoEntity sucaitougao){
       	EntityWrapper<SucaitougaoEntity> ew = new EntityWrapper<SucaitougaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sucaitougao, "sucaitougao")); 
        return R.ok().put("data", sucaitougaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SucaitougaoEntity sucaitougao){
        EntityWrapper< SucaitougaoEntity> ew = new EntityWrapper< SucaitougaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sucaitougao, "sucaitougao")); 
		SucaitougaoView sucaitougaoView =  sucaitougaoService.selectView(ew);
		return R.ok("查询素材投稿成功").put("data", sucaitougaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SucaitougaoEntity sucaitougao = sucaitougaoService.selectById(id);
        return R.ok().put("data", sucaitougao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SucaitougaoEntity sucaitougao = sucaitougaoService.selectById(id);
        return R.ok().put("data", sucaitougao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SucaitougaoEntity sucaitougao, HttpServletRequest request){
    	sucaitougao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sucaitougao);

        sucaitougaoService.insert(sucaitougao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SucaitougaoEntity sucaitougao, HttpServletRequest request){
    	sucaitougao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sucaitougao);

        sucaitougaoService.insert(sucaitougao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SucaitougaoEntity sucaitougao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sucaitougao);
        sucaitougaoService.updateById(sucaitougao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sucaitougaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SucaitougaoEntity> wrapper = new EntityWrapper<SucaitougaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = sucaitougaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
