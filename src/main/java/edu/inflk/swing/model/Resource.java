package edu.inflk.swing.model;

import java.net.URL;

public class Resource {

    public static URL getImage(String image){
        return Resource.class.getClassLoader().getResource("icons/" + image);
    }

}
