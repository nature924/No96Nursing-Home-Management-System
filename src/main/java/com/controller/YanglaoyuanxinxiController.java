package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YanglaoyuanxinxiEntity;
import com.entity.view.YanglaoyuanxinxiView;

import com.service.YanglaoyuanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 养老院信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-03 15:25:57
 */
@RestController
@RequestMapping("/yanglaoyuanxinxi")
public class YanglaoyuanxinxiController {
    @Autowired
    private YanglaoyuanxinxiService yanglaoyuanxinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YanglaoyuanxinxiEntity yanglaoyuanxinxi,
		HttpServletRequest request){
        EntityWrapper<YanglaoyuanxinxiEntity> ew = new EntityWrapper<YanglaoyuanxinxiEntity>();

		PageUtils page = yanglaoyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yanglaoyuanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YanglaoyuanxinxiEntity yanglaoyuanxinxi, 
		HttpServletRequest request){
        EntityWrapper<YanglaoyuanxinxiEntity> ew = new EntityWrapper<YanglaoyuanxinxiEntity>();

		PageUtils page = yanglaoyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yanglaoyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YanglaoyuanxinxiEntity yanglaoyuanxinxi){
       	EntityWrapper<YanglaoyuanxinxiEntity> ew = new EntityWrapper<YanglaoyuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yanglaoyuanxinxi, "yanglaoyuanxinxi")); 
        return R.ok().put("data", yanglaoyuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YanglaoyuanxinxiEntity yanglaoyuanxinxi){
        EntityWrapper< YanglaoyuanxinxiEntity> ew = new EntityWrapper< YanglaoyuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yanglaoyuanxinxi, "yanglaoyuanxinxi")); 
		YanglaoyuanxinxiView yanglaoyuanxinxiView =  yanglaoyuanxinxiService.selectView(ew);
		return R.ok("查询养老院信息成功").put("data", yanglaoyuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YanglaoyuanxinxiEntity yanglaoyuanxinxi = yanglaoyuanxinxiService.selectById(id);
		yanglaoyuanxinxi.setClicknum(yanglaoyuanxinxi.getClicknum()+1);
		yanglaoyuanxinxi.setClicktime(new Date());
		yanglaoyuanxinxiService.updateById(yanglaoyuanxinxi);
        return R.ok().put("data", yanglaoyuanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YanglaoyuanxinxiEntity yanglaoyuanxinxi = yanglaoyuanxinxiService.selectById(id);
		yanglaoyuanxinxi.setClicknum(yanglaoyuanxinxi.getClicknum()+1);
		yanglaoyuanxinxi.setClicktime(new Date());
		yanglaoyuanxinxiService.updateById(yanglaoyuanxinxi);
        return R.ok().put("data", yanglaoyuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YanglaoyuanxinxiEntity yanglaoyuanxinxi, HttpServletRequest request){
    	yanglaoyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yanglaoyuanxinxi);
        yanglaoyuanxinxiService.insert(yanglaoyuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YanglaoyuanxinxiEntity yanglaoyuanxinxi, HttpServletRequest request){
    	yanglaoyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yanglaoyuanxinxi);
        yanglaoyuanxinxiService.insert(yanglaoyuanxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YanglaoyuanxinxiEntity yanglaoyuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yanglaoyuanxinxi);
        yanglaoyuanxinxiService.updateById(yanglaoyuanxinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yanglaoyuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YanglaoyuanxinxiEntity> wrapper = new EntityWrapper<YanglaoyuanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yanglaoyuanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YanglaoyuanxinxiEntity yanglaoyuanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<YanglaoyuanxinxiEntity> ew = new EntityWrapper<YanglaoyuanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = yanglaoyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yanglaoyuanxinxi), params), params));
        return R.ok().put("data", page);
    }









}
