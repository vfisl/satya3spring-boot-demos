package com.investmentapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.investmentapp.model.Investment;
import com.investmentapp.service.IInvestmentService;

@Controller
public class InvestmentController {
	@Autowired
	IInvestmentService investmentService;

	@RequestMapping("/")
	public String homePage(Model model) {
		List<Investment> investments=investmentService.getAll();
		model.addAttribute("investments", investments);
		return "index";

	}
	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";

	}
	@RequestMapping("/addForm")
	public String addFormPage() {
		return "addformpage";

	}
	@RequestMapping(value ="/addInvestment", method=RequestMethod.POST)
	public String addInvestment(@Valid Investment investment ,BindingResult result) {
		if(result.hasErrors())
		{
			System.out.println(result.getErrorCount());
			System.out.println(result.getAllErrors());
			return "redirect:/";
		}
		investmentService.addInvestment(investment);
		return "admin";

	}
	@RequestMapping("/deleteForm")
	public String deleteFormPage() {
		return "deleteformpage";

	}
	@RequestMapping(value="/deleteplan" ,method=RequestMethod.POST)
	public String deleteInvestment(@RequestParam("planId")int planId) {
		
	
		investmentService.deleteInvestment(planId);
		return "admin";
	}
	@RequestMapping("/updateForm")
	public String updateFormPage() {
		return "editformpage";
	}
	@RequestMapping(value="/getOne" ,method=RequestMethod.POST)
	public String getById(@RequestParam("planId")int planId,Model model) {
		Investment investment=investmentService.getByID(planId);
	     model.addAttribute("investment",investment);
		return "updateformpage";
	}
   @RequestMapping(value="/updateInvestment",method=RequestMethod.POST)
 
	public String updateInvestment(Investment investment,Model model) {
	   investmentService.updateInvestment(investment.getPlanId(),investment.getAmount());
		
		return "admin";
	}
   @ExceptionHandler(Exception.class)
  public String handleException(Exception e, Model model)
  {
	  System.out.println("Exceptiuon.......");
	  model.addAttribute("error","Error Occured");
	  return "admin";
  }
}
