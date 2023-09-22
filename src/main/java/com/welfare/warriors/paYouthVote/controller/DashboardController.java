package com.welfare.warriors.paYouthVote.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @RequestMapping("/dashboard")
    public ResponseEntity<String> dashboard(){
        return ResponseEntity.status(HttpStatus.OK).body("This is a Test");
    }

}
