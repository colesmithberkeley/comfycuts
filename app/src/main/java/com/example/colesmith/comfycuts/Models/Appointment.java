package com.example.colesmith.comfycuts.Models;

public class Appointment extends Object {

    private String time;
    private String date;
    private String stylist;
    private Salon salon;
    private User user;

    public Appointment(String time, String date, String stylist, Salon salon, User user) {
        this.time = time;
        this.date = date;
        this.stylist = stylist;
        this.salon = salon;
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStylist() {
        return stylist;
    }

    public void setStylist(String stylist) {
        this.stylist = stylist;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
