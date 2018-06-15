package Kweet;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StubKweetRepository implements KweetRepository {

    private List<Kweat> kweats = new ArrayList<>();

    public StubKweetRepository() {
        Kweat kweat = new Kweat("1", "Hallo testbericht123", "1000");
        kweats.add(kweat);
        kweat = new Kweat("2", "Bananen zijn geel", "1000");
        kweats.add(kweat);
        kweat = new Kweat("3", "Appels zijn rond", "2000");
        kweats.add(kweat);
    }

    @Override
    public List<Kweat> getAllKweets() {
        return kweats;
    }

    @Override
    public List<Kweat> getKweet(String kweetId) {
        List<Kweat> toreturn = new ArrayList<>();
        for (Kweat k : kweats){
            if (k.getUserID().equals(kweetId))
            {
                toreturn.add(k);
            }
        }
        return toreturn;
    }

    @Override
    public void addKweet(Kweat k)
    {
        kweats.add(k);
    }

}