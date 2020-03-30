package com.newer.web.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.newer.domain.T_Student;
import com.newer.domain.User;
import com.newer.dto.MsgDto;
import com.newer.dto.UserDto;
import com.newer.service.MenuService;
import com.newer.service.StudentService;
import com.newer.service.UserService;

//@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private StudentService StudentService;
	@Autowired
	private MenuService MenuService;
	
	 
	@RequestMapping("findPages")
	public PageInfo fingPages(UserDto userDto,ModelMap modelMap) {
		PageInfo pageInfo=this.userService.findPages(userDto);
		modelMap.addAttribute("pageInfo", pageInfo);
		return pageInfo;
	}
	
	/**
	 * 异步处理时，如果没有文件上传
	 * @param user
	 * @return
	 * @throws Exception
	 * save1(User user) 接收的参数是该格式提交的数据application/x-www-form-urlencoded
	 *  客户端以application/json格式提交数据时，必须使用注解@RequestBody
	 */
	@RequestMapping("save1")
	public MsgDto save1(@RequestBody User user) throws Exception {		
		this.userService.save(user);
		return new MsgDto(true, "添加成功");
	}
	
	/*
	@RequestMapping("save2")
	public MsgDto save2(User user,MultipartFile  img,HttpSession session) throws Exception {
		if(img!=null && !"".equals(img.getOriginalFilename())) {
		 
			String oldName=img.getOriginalFilename();
			 
			String ext=oldName.substring(oldName.lastIndexOf("."));
		 
			String newName=UUID.randomUUID()+ext;
			 
			String realpath= session.getServletContext().getRealPath("upload")+"/"+newName;
		 
			img.transferTo(new File(realpath));
			
		 
			user.setPhoto(newName);
			
		}
		
		this.userService.save(user);
		return new MsgDto(true, "添加成功");
	}
	 */
	
	@RequestMapping("findUsers")
	public List<User> fingPages(UserDto userDto) {
		List<User> list=this.userService.findUsers(userDto); 
		return list;
	}
	
	@RequestMapping("delete")
	public boolean del(int uid) {
		int num=this.userService.delete(uid);
		if (num>0&&num==1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping("Studentsel")
	public ArrayList Studentsel() {
		ArrayList list=this.StudentService.selStudent();
		return list;
	}
	
	@RequestMapping("DelStudent")
	public boolean DelStudent(int sno) {
		int num=this.StudentService.deleteStudent(sno);
		if (num>0 && num==1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping("insert")
	public boolean insert(T_Student student) {
		int num=this.StudentService.arrStudent(student);
		if (num>0 && num==1) {
			return true;
		}
		return false;
	}
	@RequestMapping("update")
	public boolean update(T_Student student) {
		int num=this.StudentService.updatestudent(student);
		if (num>0 && num==1) {
			return true;
		}
		return false;
	}
	
	@RequestMapping("selectall")
	public ArrayList selectall(int sno) {
		ArrayList list=this.StudentService.selectall(sno);
		return list;
	}
	
	@RequestMapping("selectMenu")
	public ArrayList selectMenu(int pid) {
		ArrayList list=this.MenuService.list(pid);
		return list;
	}
	
	 

}
