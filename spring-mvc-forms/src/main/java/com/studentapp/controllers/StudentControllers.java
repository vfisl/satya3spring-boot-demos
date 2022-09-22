package com.studentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentapp.model.Student;

@Controller
public class StudentControllers {
//	@RequestMapping("/show")
//	public String printStudent(@RequestParam("studentName")String name,
//			                   @RequestParam("city")String city,
//			                   @RequestParam("studentId")int studentId, Model model)
//	{
//		Student student=new Student();
//		student.setStudentId(studentId);
//		student.setCity(city);
//		student.setStudentName(name);
//		//add to model with a dummy name send it to the next page
//        model.addAttribute("mystudent",student);
//        return "success";
//	}
	@RequestMapping(value="/show", method=RequestMethod.POST)
	public String printStudent(Student student)
	{
        return "success";
	}

}
