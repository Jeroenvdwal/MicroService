package com.jcombat.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class RemoteKweetRepository implements KweetRepository {

    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl;
    private List<Kweet> kweets;

    public RemoteKweetRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
		kweets = new ArrayList<>();
		Kweet a = new Kweet("1", "Testberichtje", "Peter Pan");
		kweets.add(a);
	}

    public void addKweet(Kweet k)
    {
        this.kweets.add(k);
    }

    public Kweet getKweetbyID(String id)
    {
        Kweet toreturn = null;
        for(Kweet k : kweets)
        {
            if (k.getId() == id)
            {
                toreturn = k;
            }
        }
        return toreturn;
    }


    public List<Kweet> getKweetsByUsername(String username)
    {
        List<Kweet> toReturn = new ArrayList<>();
        for(Kweet k : kweets)
        {
            if (k.getUsername() == username)
            {
                toReturn.add(k);
            }
        }
        return toReturn;
    }
}
