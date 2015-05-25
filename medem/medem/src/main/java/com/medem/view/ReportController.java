package com.medem.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

	@RequestMapping(value = "/reportCharts**", method = RequestMethod.GET)
	public ModelAndView reportChartsPage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("reportCharts");
		return model;
	}
}
