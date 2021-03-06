package com.jcombat.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class StubProfielRepository implements ProfielRepository {

    private List<Profiel> profiels = new ArrayList<>();

    public StubProfielRepository() {
        Profiel profile = new Profiel("1000", "1000", "Ik ben een banaan", "google.nl", "pink", "Baby", "164654846");
        profiels.add(profile);
        profile = new Profiel("2000", "2000", "Ik ben in de politiek extreem midden", "nu.nl", "red", "Highway to hell", "06231231");
        profiels.add(profile);
        profile = new Profiel("3000","3000", "Eten op de WC is de definitie van de circle of life", "123inkt.nl", "blue", "Stairway to heaven", "06154649");
        profiels.add(profile);
    }

    @Override
    public List<Profiel> getAllProfiels() {
        return profiels;
    }

    @Override
    public Profiel getProfiel(String profielId) {

        for (Profiel p : profiels)
        {
            if (p.getProfielId().equals(profielId))
            {
                return p;
            }
        }
        return null;
    }

}