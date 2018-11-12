package com.example.colesmith.comfycuts.Models;

import com.example.colesmith.comfycuts.Models.Appointment;
import com.example.colesmith.comfycuts.Models.Salon;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User extends Object {

    public String id;
    public String name;
    public List<String> preferences;
    public List<String> notes;
    public List<Appointment> appointments;
    public List<Salon> favorites;

    public User(String name, List<String> preferences, List<String> notes) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.preferences = preferences;
        this.notes = notes;
        this.appointments = new ArrayList<Appointment>();
        this.favorites = new ArrayList<Salon>();
    }
}
