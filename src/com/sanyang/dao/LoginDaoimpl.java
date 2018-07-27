package com.sanyang.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.LoginMap;
import com.sanyang.vo.LoginsInfo;
@Repository("dao")
public class LoginDaoimpl implements LoginDao{
	@Autowired
	private LoginMap mapper;
	@Override
	public List<LoginsInfo> getAll() {
		// TODO Auto-generated method stub
		return mapper.getAll();
	}
	@Override
	public LoginsInfo sel(LoginsInfo loginsInfo) {
		return mapper.sel(loginsInfo);
	}

}
