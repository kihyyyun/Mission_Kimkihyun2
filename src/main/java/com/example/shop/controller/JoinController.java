package com.example.shop.controller;


import com.example.shop.dto.JoinDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO){



        return "ok";
    }
}
