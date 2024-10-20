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
 * 健康信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
@TableName("jiankangxinxi")
public class JiankangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangxinxiEntity() {
		
	}
	
	public JiankangxinxiEntity(T t) {
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
	 * 养老院名称
	 */
					
	private String yanglaoyuanmingcheng;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 老人性别
	 */
					
	private String laorenxingbie;
	
	/**
	 * 老人年龄
	 */
					
	private String laorennianling;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 体温
	 */
					
	private String tiwen;
	
	/**
	 * 心跳
	 */
					
	private String xintiao;
	
	/**
	 * 血压
	 */
					
	private String xueya;
	
	/**
	 * 血脂
	 */
					
	private String xuezhi;
	
	/**
	 * 血糖
	 */
					
	private String xuetang;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 视力
	 */
					
	private String shili;
	
	/**
	 * 听力
	 */
					
	private String tingli;
	
	/**
	 * 测量日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date celiangriqi;
	
	/**
	 * 健康情况
	 */
					
	private String jiankangqingkuang;
	
	
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
	 * 设置：养老院名称
	 */
	public void setYanglaoyuanmingcheng(String yanglaoyuanmingcheng) {
		this.yanglaoyuanmingcheng = yanglaoyuanmingcheng;
	}
	/**
	 * 获取：养老院名称
	 */
	public String getYanglaoyuanmingcheng() {
		return yanglaoyuanmingcheng;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
	/**
	 * 设置：老人性别
	 */
	public void setLaorenxingbie(String laorenxingbie) {
		this.laorenxingbie = laorenxingbie;
	}
	/**
	 * 获取：老人性别
	 */
	public String getLaorenxingbie() {
		return laorenxingbie;
	}
	/**
	 * 设置：老人年龄
	 */
	public void setLaorennianling(String laorennianling) {
		this.laorennianling = laorennianling;
	}
	/**
	 * 获取：老人年龄
	 */
	public String getLaorennianling() {
		return laorennianling;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：体温
	 */
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
	/**
	 * 设置：心跳
	 */
	public void setXintiao(String xintiao) {
		this.xintiao = xintiao;
	}
	/**
	 * 获取：心跳
	 */
	public String getXintiao() {
		return xintiao;
	}
	/**
	 * 设置：血压
	 */
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
	/**
	 * 设置：血脂
	 */
	public void setXuezhi(String xuezhi) {
		this.xuezhi = xuezhi;
	}
	/**
	 * 获取：血脂
	 */
	public String getXuezhi() {
		return xuezhi;
	}
	/**
	 * 设置：血糖
	 */
	public void setXuetang(String xuetang) {
		this.xuetang = xuetang;
	}
	/**
	 * 获取：血糖
	 */
	public String getXuetang() {
		return xuetang;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：视力
	 */
	public void setShili(String shili) {
		this.shili = shili;
	}
	/**
	 * 获取：视力
	 */
	public String getShili() {
		return shili;
	}
	/**
	 * 设置：听力
	 */
	public void setTingli(String tingli) {
		this.tingli = tingli;
	}
	/**
	 * 获取：听力
	 */
	public String getTingli() {
		return tingli;
	}
	/**
	 * 设置：测量日期
	 */
	public void setCeliangriqi(Date celiangriqi) {
		this.celiangriqi = celiangriqi;
	}
	/**
	 * 获取：测量日期
	 */
	public Date getCeliangriqi() {
		return celiangriqi;
	}
	/**
	 * 设置：健康情况
	 */
	public void setJiankangqingkuang(String jiankangqingkuang) {
		this.jiankangqingkuang = jiankangqingkuang;
	}
	/**
	 * 获取：健康情况
	 */
	public String getJiankangqingkuang() {
		return jiankangqingkuang;
	}

}
