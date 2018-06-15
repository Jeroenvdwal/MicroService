package com.jcombat.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KweetController {

    @Autowired
    KweetRepository kweetRepository;

    @RequestMapping("/")
    public String home(){
        return "index";
    }


    @RequestMapping("/kweet/{id}")
    public Kweet byId(@PathVariable("id") String kweetID) {
        Kweet k =  kweetRepository.getKweetbyID(kweetID);
        return k;
    }

}
