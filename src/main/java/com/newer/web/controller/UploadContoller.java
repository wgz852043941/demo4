package com.newer.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("upload")
public class UploadContoller {
		
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
}
