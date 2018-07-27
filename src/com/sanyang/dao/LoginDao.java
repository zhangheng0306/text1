package com.sanyang.dao;

import java.util.List;

import com.sanyang.vo.LoginsInfo;

public interface LoginDao {
	public List<LoginsInfo> getAll();
	public LoginsInfo sel(LoginsInfo loginsInfo);
}
