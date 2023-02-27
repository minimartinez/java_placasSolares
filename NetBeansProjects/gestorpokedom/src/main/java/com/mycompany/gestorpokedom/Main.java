package com.mycompany.gestorpokedom;

public class Main {

    public static void main(String[] args) {
        String[] noms = new String[]{
            "Kandentium",
            "Demantima",
            "Eufrotructon",
            "Jokisuba"
        };
        String[] families = new String[]{
            "fuego", "tierra", "aire", "agua"
        };
        float[] atacs = new float[]{7.4f, 7.5f, 0.6f, 7f};
        float[] defenses = new float[]{2.6f, 2.5f, 9.4f, 3f};

        Pokedom[] llista = new Pokedom[4];
        for (int i = 0; i < noms.length; i++) {
            /*Pokedom p = new Pokedom(noms[i], families[i], atacs[i], defenses[i]);
            llista[i] = p; */
            llista[i] = new Pokedom(noms[i], families[i], atacs[i], defenses[i]);
        }

        PokedomDB pokedb = new PokedomDB(llista);
        if (args.length == 1) {
            Pokedom buscado = pokedb.describe(args[0]);
            if (buscado == null) {
                System.out.println("No existe ningún pokedom con ese nombre");
            } else {
                // mostramos los datos del pokedom
                System.out.println("Datos del pokedom: " + buscado.getNom());
                System.out.println("Familia: " + buscado.getFamilia());
                System.out.println("Atac: " + buscado.getAtac());
                System.out.println("Defensa: " + buscado.getDefensa());
            }
        } else {
            System.out.println("Error: debes pasar el nombre como argumento");
        }
    }

}
