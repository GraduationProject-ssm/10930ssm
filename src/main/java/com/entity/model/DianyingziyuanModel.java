package com.entity.model;

import com.entity.DianyingziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 电影资源
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
public class DianyingziyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影名称
	 */
	
	private String dianyingmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 资源链接
	 */
	
	private String ziyuanlianjie;
		
	/**
	 * 资源附件
	 */
	
	private String ziyuanfujian;
		
	/**
	 * 资源内容
	 */
	
	private String ziyuanneirong;
		
	/**
	 * 资源备注
	 */
	
	private String ziyuanbeizhu;
				
	
	/**
	 * 设置：电影名称
	 */
	 
	public void setDianyingmingcheng(String dianyingmingcheng) {
		this.dianyingmingcheng = dianyingmingcheng;
	}
	
	/**
	 * 获取：电影名称
	 */
	public String getDianyingmingcheng() {
		return dianyingmingcheng;
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
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：资源链接
	 */
	 
	public void setZiyuanlianjie(String ziyuanlianjie) {
		this.ziyuanlianjie = ziyuanlianjie;
	}
	
	/**
	 * 获取：资源链接
	 */
	public String getZiyuanlianjie() {
		return ziyuanlianjie;
	}
				
	
	/**
	 * 设置：资源附件
	 */
	 
	public void setZiyuanfujian(String ziyuanfujian) {
		this.ziyuanfujian = ziyuanfujian;
	}
	
	/**
	 * 获取：资源附件
	 */
	public String getZiyuanfujian() {
		return ziyuanfujian;
	}
				
	
	/**
	 * 设置：资源内容
	 */
	 
	public void setZiyuanneirong(String ziyuanneirong) {
		this.ziyuanneirong = ziyuanneirong;
	}
	
	/**
	 * 获取：资源内容
	 */
	public String getZiyuanneirong() {
		return ziyuanneirong;
	}
				
	
	/**
	 * 设置：资源备注
	 */
	 
	public void setZiyuanbeizhu(String ziyuanbeizhu) {
		this.ziyuanbeizhu = ziyuanbeizhu;
	}
	
	/**
	 * 获取：资源备注
	 */
	public String getZiyuanbeizhu() {
		return ziyuanbeizhu;
	}
			
}
