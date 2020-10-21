package com.uca.GestionVol;

import java.util.ArrayList;

public class Aeroport {

    private String nom;

    public ArrayList villes = new ArrayList();

    public Aeroport( String str ) {
        this.nom = str;
    }

    public String getNomAeroport() {
      return this.nom;
   }



}
