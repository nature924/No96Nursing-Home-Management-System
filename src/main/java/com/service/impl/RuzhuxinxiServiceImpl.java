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


import com.dao.RuzhuxinxiDao;
import com.entity.RuzhuxinxiEntity;
import com.service.RuzhuxinxiService;
import com.entity.vo.RuzhuxinxiVO;
import com.entity.view.RuzhuxinxiView;

@Service("ruzhuxinxiService")
public class RuzhuxinxiServiceImpl extends ServiceImpl<RuzhuxinxiDao, RuzhuxinxiEntity> implements RuzhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhuxinxiEntity> page = this.selectPage(
                new Query<RuzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<RuzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhuxinxiEntity> wrapper) {
		  Page<RuzhuxinxiView> page =new Query<RuzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhuxinxiVO> selectListVO(Wrapper<RuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhuxinxiVO selectVO(Wrapper<RuzhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhuxinxiView> selectListView(Wrapper<RuzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhuxinxiView selectView(Wrapper<RuzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
