package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
    private Date date;

    public WishMessageGenerator(Date date) {
        this.date = date;
    }

    public String generateWishMessage(String user){
        int hour=date.getHours();
        if (hour<12)
            return "GoodMorning "+user;
        else if (hour<16)
            return "Good AfterNoon "+user;
        else if (hour<20)
            return "Good Evening "+user;
        else
            return "GoodNight "+user;
    }
}
