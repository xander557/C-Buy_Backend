package com.cbuy.ssw695_backend.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class LoginController {

    @RequestMapping("login/")
    public String getLogInfo(){
        return ("Hello World");
    }
}
