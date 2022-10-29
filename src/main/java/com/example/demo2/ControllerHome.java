package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHome {
	@GetMapping({"/", "/index"})
	public ModelAndView home() {
		return new ModelAndView("home");
	}
}
