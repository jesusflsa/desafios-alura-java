package com.jesusflsa.compras;

import com.jesusflsa.compras.modelos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Elige el límite de tu tarjeta: ");
        double saldo = in.nextDouble();

        List<Producto> lista = new ArrayList<>();

        int salir = 1;
        while(salir != 0 && saldo > 0) {
            System.out.println("Escribe la descripcion de la compra: ");
            String descripcion = in.next();
            System.out.println("Escribe el valor de la compra: ");
            double precio = in.nextDouble();

            if (precio <= saldo) {
                saldo -= precio;
                Producto prod = new Producto(descripcion, precio);
                lista.add(prod);
                System.out.println("Compra realizada!");
            }
            else {
                System.out.println("Saldo insuficiente");
                break;
            }

            System.out.println("Escriba 0 para salir o 1 para continuar");
            salir = in.nextInt();
        }

        System.out.println("""
                *****************************
                COMPRAS REALIZADAS
                """);

        for (Producto p: lista) {
            System.out.println(p.getDescripcion() + " - " + p.getPrecio());
        }

        System.out.println("""
                
                *****************************
                """);
        System.out.println("Saldo de la tarjeta: " + saldo);
    }
}
