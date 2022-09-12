package org.example;

import clases.Tienda;

public class Main {
    public static void main(String[] args) {

        Tienda carrefour= new Tienda();

        double total=carrefour.calcularProducto();
        System.out.println("El costo total de la compra del producto es: " +total);
    }
}