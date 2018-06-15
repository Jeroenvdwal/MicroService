package com.jcombat.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfielController {

    @Autowired
    ProfielRepository profielRepository;

    @CrossOrigin
    @RequestMapping("/profiels")
    public Profiel[] all() {
        List<Profiel> profiels = profielRepository.getAllProfiels();
        return profiels.toArray(new Profiel[profiels.size()]);
    }

    @CrossOrigin
    @RequestMapping("/profiel/{id}")
    public Profiel byId(@PathVariable("id") String userId) {
        Profiel profiel = profielRepository.getProfiel(userId);
        return profiel;
    }
}