package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电影资源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-29 07:37:06
 */
@TableName("dianyingziyuan")
public class DianyingziyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianyingziyuanEntity() {
		
	}
	
	public DianyingziyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
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
