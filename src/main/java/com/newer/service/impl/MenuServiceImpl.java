package com.newer.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.MenuDao;
import com.newer.domain.Menu;
import com.newer.service.MenuService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
private MenuDao MenuDao;
	
	@Override
	public ArrayList list(Integer pid) {
		Example example=new Example(Menu.class);
		Criteria Criteria=example.createCriteria();
		Criteria.andEqualTo("pid",pid);
		return (ArrayList) this.MenuDao.selectByExample(example);
	}

}
