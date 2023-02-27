/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alumneinf
 */
public class Ejemplo {

    public static void main(String[] args) throws IOException {
        //Comentario de una sola linea
        System.out.println("Hello World!");
        int numero = 0;
        System.out.println("Número vale: " + numero);
        numero++;
        System.out.println("Numero vale: " + numero);
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = consola.nextInt();

        // or ||  
        // and &&
        //Hacer bucle en python
        while (numero < 10 || numero > 20) {
            System.out.println("Introduce un número entre 10 y 20: ");
            numero = consola.nextInt();
        }
        //Bucle de diferente manera
        do {
            System.out.println("Introduce un número entre 10 y 20: ");
            numero = consola.nextInt();
        } while (numero < 10 || numero > 20);

        // for i in range (1, numero + 1)
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        BufferedReader mejorConsola = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cómo te llamas?");
        String nombre = mejorConsola.readLine();
        System.out.println("Introduce tu edad: ");
        int edad = Integer.parseInt(mejorConsola.readLine());
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        
        
        if (numero > 10) {
            System.out.println("El número es mayor que 10");
        } else if (numero < 10) {
            System.out.println("El número es menor que 10");
        } else {
            System.out.println("El número es igual que 10");
        }

    }
}
