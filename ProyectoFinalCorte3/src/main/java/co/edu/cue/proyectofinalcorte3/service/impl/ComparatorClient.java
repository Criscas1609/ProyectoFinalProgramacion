package co.edu.cue.proyectofinalcorte3.service.impl;

import co.edu.cue.proyectofinalcorte3.model.Client;

import java.util.Comparator;

public class ComparatorClient implements Comparator<Client> {


    @Override
    public int compare(Client o1, Client o2) {
        String type1 = o1.getGender();
        String type2 = o2.getGender();
        return type1.compareTo(type2);
    }
}
