package com.jcombat.client;

import java.util.List;

public interface KweetRepository {
    List<Kweet> getKweetsByUsername(String username);
    Kweet getKweetbyID(String id);
    void addKweet(Kweet k);
}
