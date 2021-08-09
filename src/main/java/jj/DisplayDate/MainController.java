package jj.DisplayDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class MainController {
	 private DateFormat simpleDateFormat;



	@RequestMapping("/")
	    public String index() {
	        return "index.jsp";
	    }
	 @RequestMapping("/Date")
	 	public String Date(Model model) {
		 Date date = new Date();
		 SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		 String stringDate= DateFor.format(date);
		 model.addAttribute("date",stringDate);
		 
		 return "Date.jsp";
	 }
	 	
	 
	 
	 @RequestMapping("/Time")
	 public String time(Model model) {
		 Date date = new Date();
		 SimpleDateFormat DateFor = new SimpleDateFormat("K:mm a");
		 String stringDate= DateFor.format(date);
		 model.addAttribute("date",stringDate);
		 return "Time.jsp";
	 }
	 
}

