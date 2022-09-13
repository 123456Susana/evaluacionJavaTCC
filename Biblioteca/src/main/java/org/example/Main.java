package org.example;

import clases.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int observador=100;
        Scanner entradaPorTeclado= new Scanner(System.in);

        Libro psicoanalista = new Libro();

        System.out.println("Digite el nombre del libro: ");
        psicoanalista.setNombre(entradaPorTeclado.next());
        System.out.println("Digite el codigo del libro: ");
        psicoanalista.setCodigo(entradaPorTeclado.next());
        System.out.println("Digite numero de paginas del libro: ");
        psicoanalista.setNumeroDePaginas(entradaPorTeclado.nextInt());
        System.out.println("Digite numero de ejemplares del libro: ");
        psicoanalista.setNumeroDeEjemplares(entradaPorTeclado.nextInt());
        System.out.println("Digite el nombre del autor: ");
        psicoanalista.setAutor(entradaPorTeclado.next());


        System.out.println("*****MENU****");
        System.out.println("1. Consultar libro");
        System.out.println("2. Modificar libro");
        System.out.println("3. Modificar numero de ejemplares");
        System.out.println("4. Salir");

        while(observador!=4){
            System.out.println("Digite una opcion: ");
            observador=entradaPorTeclado.nextInt();

            if(observador==1){
                System.out.println("Nombre del libro: "+psicoanalista.getNombre());
                System.out.println("Codigo del libro: "+psicoanalista.getCodigo());
                System.out.println("Numero de paginas del libro: "+psicoanalista.getNumeroDePaginas());
                System.out.println("Numero de ejemplares del libro: "+psicoanalista.getNumeroDeEjemplares());
                System.out.println("Autor del libro: "+psicoanalista.getAutor());
            }else if (observador==2) {
                System.out.println("Digite el nombre del libro: ");
                psicoanalista.setNombre(entradaPorTeclado.next());
                System.out.println("Digite el codigo del libro: ");
                psicoanalista.setCodigo(entradaPorTeclado.next());
                System.out.println("Digite numero de paginas del libro: ");
                psicoanalista.setNumeroDePaginas(entradaPorTeclado.nextInt());
                System.out.println("Digite numero de ejemplares del libro: ");
                psicoanalista.setNumeroDeEjemplares(entradaPorTeclado.nextInt());
                System.out.println("Digite el nombre del autor: ");
                psicoanalista.setAutor(entradaPorTeclado.next());
            } else if (observador==3) {
                System.out.println("Digite el nuevo numero de ejemplares: ");
                psicoanalista.setNumeroDeEjemplares(entradaPorTeclado.nextInt());
                System.out.println("El nuevo numero de ejemplares de el libro:"+psicoanalista.getNombre() + " es: "+ psicoanalista.getNumeroDeEjemplares());
            }else if (observador==4) {
                System.out.println("Salir");
                break;
            }else{
                System.out.println("Opcion Invalida");
            }
            System.out.print("1.Consultar libro");System.out.print(" 2.Modificar libro");System.out.print(" 3.Modificar numero de ejemplares");System.out.println(" 4.Salir");
        }
    }
}