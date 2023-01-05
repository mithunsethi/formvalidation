package com.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
         @GetMapping("/addPerson")
         public String viewPageOfFormValidation() {
        	       
        	 return"valid/formvalidation";
         }
}
