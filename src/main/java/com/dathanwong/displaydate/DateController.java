package com.dathanwong.displaydate;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		String text = String.format("%tB, the %<td of %<tB, %<tY", date);
		model.addAttribute("date", text);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		String text = String.format("%tI:%<tM %<tp", date);
		model.addAttribute("time", text);
		return "time.jsp";
	}
}
