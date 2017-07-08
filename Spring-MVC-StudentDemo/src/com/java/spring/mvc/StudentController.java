package com.java.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		//Create the student object 
		Student theStudent = new Student();
		
		//Add the object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		//Log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
								+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
