package com.jesusflsa.compras.modelos;

public class Producto implements Comparable<Producto> {
    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.getDescripcion() + " - " + this.getPrecio();
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(getPrecio(), o.getPrecio());
    }
}
