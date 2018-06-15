package com.jcombat.profile;

import java.io.Serializable;

public class Profiel implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getProfielID() {
        return profielID;
    }

    private String userID;
    private String profielID;
    private String bio;
    private String website;
    private String favcolor;
    private String songtitle;
    private String phonenumber;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFavcolor() {
        return favcolor;
    }

    public void setFavcolor(String favcolor) {
        this.favcolor = favcolor;
    }

    public String getSongtitle() {
        return songtitle;
    }

    public void setSongtitle(String songtitle) {
        this.songtitle = songtitle;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }



    public String getProfielId() {
        return profielID;
    }
    public void setProfielID(String profielId) {
        this.profielID = profielId;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Profile [userID=" + userID + ", profielID=" + profielID + ", bio=" + bio + ", website=" + website + ", favcolor=" + favcolor + ", songtitle=" + songtitle + ", phonenumber=" + phonenumber + "]";
    }

    public Profiel() {
        // TODO Auto-generated constructor stub
    }

    public Profiel(String userID, String profielId, String bio, String website, String favcolor, String songtitle, String phonenumber) {
        super();
        this.userID = userID;
        this.profielID = profielId;
        this.bio = bio;
        this.website = website;
        this.favcolor = favcolor;
        this.songtitle = songtitle;
        this.phonenumber = phonenumber;
    }
}
