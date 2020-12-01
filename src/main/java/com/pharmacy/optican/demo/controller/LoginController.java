package com.pharmacy.optican.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login_page")
    public String loginPage() {
        return "login-page";
    }
}
