package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YanglaoyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YanglaoyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YanglaoyuanxinxiView;


/**
 * 养老院信息
 *
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
public interface YanglaoyuanxinxiService extends IService<YanglaoyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YanglaoyuanxinxiVO> selectListVO(Wrapper<YanglaoyuanxinxiEntity> wrapper);
   	
   	YanglaoyuanxinxiVO selectVO(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
   	
   	List<YanglaoyuanxinxiView> selectListView(Wrapper<YanglaoyuanxinxiEntity> wrapper);
   	
   	YanglaoyuanxinxiView selectView(@Param("ew") Wrapper<YanglaoyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YanglaoyuanxinxiEntity> wrapper);
   	

}

