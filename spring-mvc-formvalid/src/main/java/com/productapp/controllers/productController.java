package com.productapp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.productapp.model.Product;

@Controller
public class productController {
	@RequestMapping("/showForm")
	public String formPage()
	{
		return "addForm";
	}
	
	@RequestMapping("/addProduct")
	public String printPage(@Valid Product product, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println("sadik you have done "+result.getErrorCount()+"mistakes");
			System.out.println(result.getAllErrors());
			return "addForm";
		}
		return "success";
	}

}
