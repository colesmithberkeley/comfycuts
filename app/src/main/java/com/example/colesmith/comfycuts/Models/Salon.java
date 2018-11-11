package com.example.colesmith.comfycuts.Models;

import android.media.Image;

import java.util.List;

public class Salon extends Object {

    private String name;
    private String about;
    private String services;
    private String hours;
    private int rating;
    private List<Image> pictures;
    private List<String> details;
    private List<String> stylists;

    public Salon(String name, String about, String services, String hours, int rating, List<Image> pictures, List<String> details, List<String> stylists) {
        this.name = name;
        this.about = about;
        this.services = services;
        this.hours = hours;
        this.rating = rating;
        this.pictures = pictures;
        this.details = details;
        this.stylists = stylists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Image> getPictures() {
        return pictures;
    }

    public void setPictures(List<Image> pictures) {
        this.pictures = pictures;
    }

    public List<String> getStylists() {
        return stylists;
    }

    public void setStylists(List<String> stylists) {
        this.stylists = stylists;
    }

    public void addStylist(String stylist) {
        this.stylists.add(stylist);
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public void addDetail(String detail) {
        this.details.add(detail);
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
