package com.entity.model;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
public class JiankangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date celiangriqi;
		
	/**
	 * 健康情况
	 */
	
	private String jiankangqingkuang;
				
	
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
