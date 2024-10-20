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


import com.dao.YanglaoyuanxinxiDao;
import com.entity.YanglaoyuanxinxiEntity;
import com.service.YanglaoyuanxinxiService;
import com.entity.vo.YanglaoyuanxinxiVO;
import com.entity.view.YanglaoyuanxinxiView;

@Service("yanglaoyuanxinxiService")
public class YanglaoyuanxinxiServiceImpl extends ServiceImpl<YanglaoyuanxinxiDao, YanglaoyuanxinxiEntity> implements YanglaoyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanglaoyuanxinxiEntity> page = this.selectPage(
                new Query<YanglaoyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<YanglaoyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanglaoyuanxinxiEntity> wrapper) {
		  Page<YanglaoyuanxinxiView> page =new Query<YanglaoyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YanglaoyuanxinxiVO> selectListVO(Wrapper<YanglaoyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanglaoyuanxinxiVO selectVO(Wrapper<YanglaoyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanglaoyuanxinxiView> selectListView(Wrapper<YanglaoyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanglaoyuanxinxiView selectView(Wrapper<YanglaoyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
