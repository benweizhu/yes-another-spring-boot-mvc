package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NeedToLoginController {
    @RequestMapping("/need-login-page")
    public String needToLogin(){
        return "need-login-page";
    }
}
