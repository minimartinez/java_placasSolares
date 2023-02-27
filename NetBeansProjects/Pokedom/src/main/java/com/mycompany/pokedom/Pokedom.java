/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedom;

/**
 *
 * @author Alumneinf
 */
public class Pokedom {
    private String nom;
    private String familia;
    private float atac;
    private float defensa;
    
    public Pokedom(String nom, String familia, float atac, float defensa) {
        this.nom = nom;
        this.familia = familia;
        this.atac = atac;
        this.defensa = defensa;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getFamilia() {
        return this.familia;
    }
    
    public float getAtac() {
        return this.atac;
    }
    
    public float getDefensa() {
        return this.defensa;
    }
}
