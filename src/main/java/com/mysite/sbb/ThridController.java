package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThridController {

	@GetMapping("/index/thrid")
    public String ThridPage() {
        return "thrid";
    }

}
