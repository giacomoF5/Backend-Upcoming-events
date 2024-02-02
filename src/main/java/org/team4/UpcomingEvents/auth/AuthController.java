package org.team4.upcomingevents.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="${api-endpoint}")
public class AuthController {
    @GetMapping(path="/login")

    public String login(){
        return "conected";
        
    }
}
