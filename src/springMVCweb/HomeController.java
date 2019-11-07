package springMVCweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class HomeController {
	@RequestMapping("/show")
	public ModelAndView ShowPage() {
		ModelAndView m=new ModelAndView();
		m.setViewName("Home");
		return m;
		
		
	}

}
