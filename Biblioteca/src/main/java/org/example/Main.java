package org.example;

import clases.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado= new Scanner(System.in);

        Libro psicoanalista = new Libro();

        System.out.println("Digite el nombre del libro: ");

        int observador=100;
        System.out.println("*****MENU****");
        System.out.println("1. Consultar libro");
        System.out.println("2. Modificar libro");
        System.out.println("3. Salir");


        System.out.println("digite el numero de ejemplares:");
        psicoanalista.setNumeroDeEjemplares(entradaPorTeclado.nextInt());
        System.out.println(psicoanalista.getNumeroDeEjemplares());





    }
}