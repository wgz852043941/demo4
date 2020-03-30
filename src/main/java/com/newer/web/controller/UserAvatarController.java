package com.newer.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.newer.domain.User;
import com.newer.domain.UserAvatar;
import com.newer.dto.MsgDto;
import com.newer.dto.PageDto;
import com.newer.dto.UserDto;
import com.newer.service.UserAvatarService;

@RestController
@RequestMapping("acatar")
public class UserAvatarController {
	@Autowired
private UserAvatarService UserAvatarService;
	
	@RequestMapping("findPages")
	public PageInfo fingPages(PageDto pagedto,ModelMap modelMap) {
		PageInfo pageInfo=this.UserAvatarService.findPages(pagedto);
		modelMap.addAttribute("pageInfo", pageInfo);
		return pageInfo;
	}
	@RequestMapping("save1")
	public MsgDto save1(@RequestBody UserAvatar UserAvatar) throws Exception {		
		this.UserAvatarService.save(UserAvatar);
		return new MsgDto(true, "添加成功");
	}
	
	@RequestMapping("uploadsc")
	public String upload(MultipartFile  img,HttpSession session) throws IllegalStateException, IOException{
		String path="/upload";
		if(img!=null && !"".equals(img.getOriginalFilename())) {
			 
			String oldName=img.getOriginalFilename();
			 
			String ext=oldName.substring(oldName.lastIndexOf("."));
		 
			String newName=UUID.randomUUID()+ext;
			 
			String realpath= session.getServletContext().getRealPath("upload")+"/"+newName;
		 
			img.transferTo(new File(realpath));
			
		 
			return path+"/"+newName;
			
		}
		return null;
	}
	
	@RequestMapping("del")
	public MsgDto del(int uid) throws Exception {		
		this.UserAvatarService.delete(uid);
		return new MsgDto(true, "删除成功");
	}
	
	@RequestMapping("upd")
	public MsgDto upd(UserAvatar UserAvatar){		
		this.UserAvatarService.update(UserAvatar);
		return new MsgDto(true, "修改成功");
	}
}
