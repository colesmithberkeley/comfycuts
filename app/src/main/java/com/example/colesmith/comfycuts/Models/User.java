package com.example.colesmith.comfycuts.Models;

import com.example.colesmith.comfycuts.Models.Appointment;
import com.example.colesmith.comfycuts.Models.Salon;

import java.util.ArrayList;
import java.util.List;

public class User extends Object {

    private String name;
    private List<String> preferences;
    private List<String> notes;
    private List<Appointment> appointments;
    private List<Salon> favorites;

    public User(String name, List<String> preferences, List<String> notes) {
        this.name = name;
        this.preferences = preferences;
        this.notes = notes;
        this.appointments = new ArrayList<Appointment>();
        this.favorites = new ArrayList<Salon>();
    }
}
