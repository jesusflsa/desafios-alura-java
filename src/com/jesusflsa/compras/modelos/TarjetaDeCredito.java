package com.jesusflsa.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double saldo;
    private List<Producto> lista;

    public TarjetaDeCredito(double saldo) {
        this.saldo = saldo;
        this.lista = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public boolean comprar(Producto prod) {
        if (this.saldo >= prod.getPrecio()) {
            this.lista.add(prod);
            this.saldo -= prod.getPrecio();
            return true;
        }
        return false;
    }

    public void mostrarCompras() {
        for (Producto p : this.lista) {
            System.out.println(p.toString());
        }
    }
}
