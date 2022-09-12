package org.example;

import clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado= new Empleado();

        empleado.setSalario(3500000);
        empleado.setValorComision(1500000);
        empleado.setDeducciones(0.05);


        Scanner entradaPorTeclado= new Scanner(System.in);

        System.out.println("Digite su identificacion: ");
        empleado.setIdentificacion(entradaPorTeclado.nextLine());

        System.out.println("Digite su nombre: ");
        empleado.setNombre(entradaPorTeclado.nextLine());

        int salario=empleado.getSalario();
        System.out.println("Salario mensual: " + salario);

        int valorComision= empleado.getValorComision();
        System.out.println("Valor de comision mensual: " + valorComision);

        double deducciones= empleado.getDeducciones();
        System.out.println("Valor deduccion: " + deducciones);

        System.out.println("Digite su Numero de ventas mensuales: ");
        empleado.setNumeroVentasMensuales(entradaPorTeclado.nextInt());

        double totalSalario= empleado.calcularSalario();
        System.out.println("El salario mensual de " + empleado.getNombre() + " es " + String.format("%.2f",totalSalario));


    }
}