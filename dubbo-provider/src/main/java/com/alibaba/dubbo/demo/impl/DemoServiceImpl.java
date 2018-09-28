package com.alibaba.dubbo.demo.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.demo.DemoService;

/**
 * 描述：提供远程服务
 * 
 * @author niushi
 * @time 2018 下午2:51:13
 *
 */
public class DemoServiceImpl implements DemoService {

	public List<String> getPermissions(Long id) {
		List<String> demo = new ArrayList<String>();
		demo.add(String.format("Permission_%d", id - 1));
		demo.add(String.format("Permission_%d", id));
		demo.add(String.format("Permission_%d", id + 1));
		return demo;
	}

}
