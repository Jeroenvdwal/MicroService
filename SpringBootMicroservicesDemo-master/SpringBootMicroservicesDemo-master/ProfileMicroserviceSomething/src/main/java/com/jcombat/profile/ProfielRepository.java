package com.jcombat.profile;

import java.util.List;

public interface ProfielRepository {
    List<Profiel> getAllProfiels();
    Profiel getProfiel(String profielID);
}
