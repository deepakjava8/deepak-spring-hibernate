package com.mostonsoft.spring.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class StudentController {

	@Autowired
	StudentValidator studentValidator;
	@RequestMapping(value="/register.do")
	public String showStudentRegistrationForm(Map map){
		Student stu=new Student();
		map.put("studentCommand", stu);
		return "register";
	}
	
	@RequestMapping(value="/studentRegister.do",method=RequestMethod.POST)
	
	public String registerStudent(@ModelAttribute("studentCommand")Student stud,BindingResult result){
		studentValidator.validate(stud, result);
		if(result.hasErrors()){
			return "register";
		}
		System.out.println(stud.getSid());
		System.out.println(stud.getSname());
		System.out.println(stud.getEmail());
		System.out.println(stud.getPhone());
		String time[]=stud.getTimings();
		for(String ti:time){
			System.out.println(ti);
		}
		System.out.println(stud.getQualification());
		System.out.println(stud.getGender());
		System.out.println(stud.getRemarks());
		return "home";
	}
}
