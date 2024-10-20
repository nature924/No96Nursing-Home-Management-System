package com.dao;

import com.entity.YanglaoyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanglaoyuanxinxiVO;
import com.entity.view.YanglaoyuanxinxiView;


/**
 * 养老院信息
 * 
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
public interface YanglaoyuanxinxiDao extends BaseMapper<YanglaoyuanxinxiEntity> {
	
	List<YanglaoyuanxinxiVO> selectListVO(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
	
	YanglaoyuanxinxiVO selectVO(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
	
	List<YanglaoyuanxinxiView> selectListView(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);

	List<YanglaoyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
	
	YanglaoyuanxinxiView selectView(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
	

}
