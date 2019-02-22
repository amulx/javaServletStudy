package com.amu;

public class mybean {
    private int userid;
    private String username;

    public mybean(int userid, String username) {
        this.userid = userid;
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
