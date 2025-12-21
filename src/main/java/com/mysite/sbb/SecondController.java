package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
	
	@GetMapping("/index/second")
    public String SecondPage() {
        return "second";
    }

}
