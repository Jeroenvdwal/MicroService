package Kweet;

import java.util.List;

public interface KweetRepository {
    List<Kweat> getAllKweets();
    List<Kweat> getKweet(String kweetId);
    void addKweet(Kweat k);
}
