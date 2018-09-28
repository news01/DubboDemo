package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * 存放公共接口
 * 
 * @author niushi
 * @time 2018 ����2:49:38
 *
 */
public interface DemoService {
	List<String> getPermissions(Long id);
}
