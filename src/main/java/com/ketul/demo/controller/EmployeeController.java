package com.ketul.demo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

import javax.servlet.http.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ketul.demo.module.Employee;
import com.ketul.demo.myRepo.MyRepo;

@Controller
public class EmployeeController {
	
	@Autowired
	MyRepo repo;
	
	@PostMapping("reg")
	public String insert(@RequestParam(name = "eid") int eid, @RequestParam(name = "eimage") MultipartFile file) throws IOException {

		System.out.println(file.getInputStream().readAllBytes().length);
		Employee e = new Employee(eid, file.getInputStream().readAllBytes());
		repo.save(e);
		return("insert.jsp");
	}

	@RequestMapping("show")
	public ModelAndView show(@RequestParam int eid, HttpServletRequest req, HttpServletResponse res) throws IOException, SQLException {
		res.setContentType("image/*");
		ModelAndView mv = new ModelAndView("show.jsp");
		Employee e = repo.findById(eid).orElse(new Employee());
		String base64Encoded = new String(Base64.getEncoder().encode(e.getEimage()));
		mv.addObject("employee" , base64Encoded);
		return mv;
	}
	
//	@RequestMapping("all")
//	public ModelAndView all(Employee e) {
//		ModelAndView mv = new ModelAndView("show.jsp");
//		ArrayList<Employee> l = repo.findAll(e);
//		mv.addObject("employee", l);
//		return mv;
//	}
}
