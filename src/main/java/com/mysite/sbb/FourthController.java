package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourthController {
	
	@GetMapping("/index/fourth")
    public String ThridPage() {
        return "fourth";
    }

}
