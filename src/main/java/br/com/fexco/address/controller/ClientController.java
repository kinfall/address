package br.com.fexco.address.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
	
	@RequestMapping(value="/")
    public String homepage(){
        return "index";
    }

}
