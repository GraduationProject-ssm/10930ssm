package com.entity.model;

import com.entity.FufeidianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 付费电影
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public class FufeidianyingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影标签
	 */
	
	private String dianyingbiaoqian;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 演员
	 */
	
	private String yanyuan;
		
	/**
	 * 预告
	 */
	
	private String yugao;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 上映日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangyingriqi;
		
	/**
	 * 电影介绍
	 */
	
	private String dianyingjieshao;
				
	
	/**
	 * 设置：电影标签
	 */
	 
	public void setDianyingbiaoqian(String dianyingbiaoqian) {
		this.dianyingbiaoqian = dianyingbiaoqian;
	}
	
	/**
	 * 获取：电影标签
	 */
	public String getDianyingbiaoqian() {
		return dianyingbiaoqian;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：演员
	 */
	 
	public void setYanyuan(String yanyuan) {
		this.yanyuan = yanyuan;
	}
	
	/**
	 * 获取：演员
	 */
	public String getYanyuan() {
		return yanyuan;
	}
				
	
	/**
	 * 设置：预告
	 */
	 
	public void setYugao(String yugao) {
		this.yugao = yugao;
	}
	
	/**
	 * 获取：预告
	 */
	public String getYugao() {
		return yugao;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：上映日期
	 */
	 
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
	}
				
	
	/**
	 * 设置：电影介绍
	 */
	 
	public void setDianyingjieshao(String dianyingjieshao) {
		this.dianyingjieshao = dianyingjieshao;
	}
	
	/**
	 * 获取：电影介绍
	 */
	public String getDianyingjieshao() {
		return dianyingjieshao;
	}
			
}
