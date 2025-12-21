package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index")
    public String indexPage() {
        return "index.html";
    }
	
	@GetMapping("/")
    public String root() {
        return "redirect:/index";
    }
}
