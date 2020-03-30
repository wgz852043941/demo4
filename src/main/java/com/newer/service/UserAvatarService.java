package com.newer.service;

import com.github.pagehelper.PageInfo;
import com.newer.domain.User;
import com.newer.domain.UserAvatar;
import com.newer.dto.PageDto;

public interface UserAvatarService {
	  public PageInfo<UserAvatar> findPages(PageDto Pagedto);
	  public boolean save(UserAvatar UserAvatar);
	  public boolean delete(int uid);
	  public boolean update(UserAvatar UserAvatar);
}
