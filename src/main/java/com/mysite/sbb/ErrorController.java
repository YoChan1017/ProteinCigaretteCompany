package com.mysite.sbb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice // 전역 예외 처리를 위한 어노테이션
public class ErrorController {

    private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping("/handleError")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // HTTP 상태 코드 설정
    public String handleError(Model model) {
        String errorMessage = "An unexpected error occurred.";
        logger.error(errorMessage); // 로그 기록
        model.addAttribute("errorMessage", errorMessage);
        return "error"; // templates/error.html로 이동
    }
}
