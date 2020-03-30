package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.dao.UserAvatarDao;
import com.newer.domain.UserAvatar;
import com.newer.dto.PageDto;
import com.newer.service.UserAvatarService;
@Service
public class UserAvatarServiceImpl implements UserAvatarService{
	@Autowired
private UserAvatarDao UserAvatarDao;
	
	@Override
	public PageInfo<UserAvatar> findPages(PageDto Pagedto) {
		PageHelper.startPage(Pagedto.getPage(), Pagedto.getPageSize());
		List list =this.UserAvatarDao.selectAll();
		PageInfo pageInfo=new PageInfo(list);
		return pageInfo;
	}

	@Override
	public boolean save(UserAvatar UserAvatar) {
		// TODO Auto-generated method stub
		return this.UserAvatarDao.insert(UserAvatar)>0?true:false;
	}

	@Override
	public boolean delete(int uid) {
		// TODO Auto-generated method stub
		return this.UserAvatarDao.deleteByPrimaryKey(uid)>0?true:false;
	}

	@Override
	public boolean update(UserAvatar UserAvatar) {
		return this.UserAvatarDao.updateByPrimaryKey(UserAvatar)>0?true:false;
	}

}
