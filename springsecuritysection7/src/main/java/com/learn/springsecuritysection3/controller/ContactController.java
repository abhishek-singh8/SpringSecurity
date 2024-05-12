package com.learn.springsecuritysection3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contacts")
    public String saveContactEnquiryDetails(){
        return "Inquiry details are saved in DB";
    }
}