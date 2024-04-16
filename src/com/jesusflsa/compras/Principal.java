package com.jesusflsa.compras;

import com.jesusflsa.compras.modelos.Producto;
import com.jesusflsa.compras.modelos.TarjetaDeCredito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Elige el límite de tu tarjeta: ");
        double saldo = in.nextDouble();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(saldo);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Escribe la descripcion de la compra: ");
            String descripcion = in.next();
            System.out.println("Escribe el valor de la compra: ");
            double precio = in.nextDouble();

            Producto prod = new Producto(descripcion, precio);
            boolean compraRealiazada = tarjeta.comprar(prod);

            if (compraRealiazada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = in.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }

        System.out.println("*****************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        tarjeta.mostrarCompras();
        System.out.println("*****************************");
        System.out.println("Saldo de la tarjeta: " + tarjeta.getSaldo());

    }
}
