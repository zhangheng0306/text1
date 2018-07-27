package com.sanyang.mapper;

import java.util.List;

import com.sanyang.vo.LoginsInfo;

public interface LoginMap {
	public List<LoginsInfo> getAll();
	public LoginsInfo sel(LoginsInfo loginsInfo);
		
	
	

}
