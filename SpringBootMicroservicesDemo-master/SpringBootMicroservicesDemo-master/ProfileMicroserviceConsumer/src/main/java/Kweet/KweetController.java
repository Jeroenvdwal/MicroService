package Kweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import javax.ejb.Stateless;

@RestController
public class KweetController {

    @Autowired
    KweetRepository kweetRepository;

    @CrossOrigin//(origins = "http://localhost:3333")
    @RequestMapping("/kweets")
    public List<Kweat> all() {
        List<Kweat> kweats = kweetRepository.getAllKweets();
        return kweats; //.ok(kweats).build(); // kweats.toArray(new Kweat[kweats.size()]);
    }

    @CrossOrigin//(origins = "http://localhost:3333")
    @RequestMapping("/kweet/{id}")
    public List<Kweat> byId(@PathVariable("id") String kweetId) {
        List<Kweat> k = kweetRepository.getKweet(kweetId);
        return k; // Response.ok(k).build();
    }


}