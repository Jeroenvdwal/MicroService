package Kweet;

import java.io.Serializable;

public class Kweat implements Serializable {

    private static final long serialVersionUID = 1L;
    private String kweetID;
    private String message;
    private String userID;

    public String getKweetID() {
        return kweetID;
    }
    public void setKweetId(String kweetID) {
        this.kweetID = kweetID;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) { this.message = message; }
    public String getUserID() { return  userID; }
    public void setUserID(String userid) { this.userID = userID; }

    @Override
    public String toString() {
        return "Kweat [kweetID=" + kweetID + ", Message=" + message + "UserID=" + userID + "]";
    }

    public Kweat() {
        // TODO Auto-generated constructor stub
    }

    public Kweat(String kweetID, String message, String userID) {
        super();
        this.kweetID = kweetID;
        this.message = message;
        this.userID = userID;
    }
}
