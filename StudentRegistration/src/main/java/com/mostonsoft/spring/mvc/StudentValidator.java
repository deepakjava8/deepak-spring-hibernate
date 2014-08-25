package com.mostonsoft.spring.mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	public boolean supports(Class clazz) {
		
		return Student.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		Student stu=(Student)obj;
		if(stu.getSid()==null || stu.getSid().length()==0){
			errors.rejectValue("sid", "errors.sid.required", null, "Sid is Required");
		}
		if(stu.getSname()==null || stu.getSname().length()==0){
			errors.rejectValue("sname", "errors.sname.required", null, "Sname is Required");
		}
		if(stu.getEmail()==null || stu.getEmail().length()==0){
			errors.rejectValue("email", "errors.email.required", null, "Email is Required");
		}else if(!((stu.getEmail().contains("@")) && (stu.getEmail().endsWith(".com")||stu.getEmail().endsWith("co.in")||stu.getEmail().endsWith(".in")))){
			errors.rejectValue("email", "errors.email.required", null, "Invalid Email ID");
		}
		if(stu.getPhone()==null || stu.getPhone().length()==0){
			errors.rejectValue("phone", "errors.phone.required", null, "Phone is Required");
		}else if(stu.getPhone().length()!=10){
			errors.rejectValue("phone", "errors.phone.required", null, "Phone Contaisn 10 Digits Required");
		}else if(stu.getPhone().length()==10){
			try{
				Integer.parseInt(stu.getPhone());
			}catch(Exception e){
				errors.rejectValue("phone", "errors.phone.required", null, "Phone contains only Digits");
			}
		}
		if(stu.getTimings().length<1){
			errors.rejectValue("timings", "errors.timings.required", null, "Select Suitable Timings");
		}
		if(stu.getGender()==null || stu.getGender().length()==0){
			errors.rejectValue("gender", "errors.gender.required", null, "Gender is Required");
		}
		if(stu.getQualification()==null || stu.getQualification().length()==0||stu.getQualification().equals("-select-")){
			errors.rejectValue("qualification", "errors.qualification.required", null, "Select Qualification");
		}
		if(stu.getRemarks()==null || stu.getRemarks().length()==0){
			errors.rejectValue("remarks", "errors.remarks.required", null, "Write some Messages");
		}
		
	}

}
