package com.example.colesmith.comfycuts.ActivityModels;

import com.example.colesmith.comfycuts.Models.Salon;

import java.util.List;

public class SalonModel {

    private Salon salon;
    private String distance;

    public SalonModel(Salon salon) {
        this.salon = salon;
    }

    public String getNameText() {
        return this.salon.getName();
    }

    public String getDistanceText() {
        return "- 1.2 miles";
    }

    public int getStars() {
        return salon.getRating();
    }

    public String getDetailsText() {
        List<String> details = this.salon.getDetails();
        String detailsText = "";

        for (int i = 0; i < details.size(); i++) {
            detailsText = detailsText + "• " + details.get(i) + "\n";
        }
        return detailsText;
    }

    public String getHoursText() {
        return "Hours: " + salon.getHours();
    }

}
