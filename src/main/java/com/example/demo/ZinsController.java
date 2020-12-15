package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ZinsController {

	private final ZinsService zinsService;

	/*
	public ZinsController(ZinsService zinsService) {
		this.zinsService = zinsService;
	}

	 */

	@GetMapping("/")
	public String getform(){
		return "zinsform";
	}

	@PostMapping("/")
	public String postForm(Model model, @ModelAttribute("zinsen") ZinsForm zinsForm){
		//zinsService.berecheEndkapital
		return "zinsform";
	}


}
