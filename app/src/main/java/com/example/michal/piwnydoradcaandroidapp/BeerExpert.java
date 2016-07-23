package com.example.michal.piwnydoradcaandroidapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michał on 23.07.2016.
 */
public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();

        if (color.equals("bursztynowe")){
            brands.add("Amber Johanes");
            brands.add("Książęce Czerwony Lager");
        } else if (color.equals("ciemne")){
            brands.add("Okocim Ciemne Palone");
            brands.add("Black Hope");
        } else {
            brands.add("Żywiec APA");
        }

        return brands;
    }
}
