package com.entity.view;

import com.entity.RuzhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入住信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
@TableName("ruzhuxinxi")
public class RuzhuxinxiView  extends RuzhuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhuxinxiView(){
	}
 
 	public RuzhuxinxiView(RuzhuxinxiEntity ruzhuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
