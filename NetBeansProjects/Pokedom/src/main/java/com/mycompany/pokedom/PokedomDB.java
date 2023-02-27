/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedom;

/**
 *
 * @author Alumneinf
 */
public class PokedomDB {
    Pokedom[] llista;
    
    public PokedomDB(Pokedom[] llista) {
        this.llista = llista;
    }
    
    // función que a partir del nombre devuelve un Pokedom
    // Si no existe devuelve null!!!!!!!!!!!!!!
    public Pokedom describe(String nom) {
        for (int i = 0; i < llista.length; i++) {
            if (nom.equalsIgnoreCase(llista[i].getNom())) {
                return llista[i];
            }
        }
        return null;
    }
    
}
