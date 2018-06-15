package Kweet;

import java.io.Serializable;

public class Kweat implements Serializable {

    private static final long serialVersionUID = 1L;
    private String kweetId;
    private String message;
    private String userid;

    public String getKweetId() {
        return kweetId;
    }
    public void setKweetId(String kweetId) {
        this.kweetId = kweetId;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) { this.message = message; }
    public String getUserID() { return  userid; }
    public void setUserID(String userid) { this.userid = userid; }

    @Override
    public String toString() {
        return "Kweat [kweetId=" + kweetId + ", Message=" + message + "UserId=" + userid + "]";
    }

    public Kweat() {
        // TODO Auto-generated constructor stub
    }

    public Kweat(String kweetId, String message, String userid) {
        super();
        this.kweetId = kweetId;
        this.message = message;
        this.userid = userid;
    }
}
