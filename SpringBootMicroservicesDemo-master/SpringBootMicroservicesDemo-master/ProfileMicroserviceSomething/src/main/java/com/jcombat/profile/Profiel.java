package com.jcombat.profile;

import java.io.Serializable;

public class Profiel implements Serializable {

    private static final long serialVersionUID = 1L;
    private String profielId;
    private String bio;

    public String getProfielId() {
        return profielId;
    }
    public void setProfielId(String profielId) {
        this.profielId = profielId;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Profile [profielId=" + profielId + ", bio=" + bio + "]";
    }

    public Profiel() {
        // TODO Auto-generated constructor stub
    }

    public Profiel(String profielId, String bio) {
        super();
        this.profielId = profielId;
        this.bio = bio;
    }
}
