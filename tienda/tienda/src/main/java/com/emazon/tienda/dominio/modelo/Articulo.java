package com.emazon.tienda.dominio.modelo;

public class Articulo {
    private long id;
    private String nombre;
    private int cantidadarticulos;
    private double precio;
    private Categoria categoria;
    private Marca marca;

    public Articulo(long id, String nombre, int cantidadarticulos, double precio, Categoria categoria, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadarticulos = cantidadarticulos;
        this.precio = precio;
        this.categoria = categoria;
        this.marca = marca;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadarticulos() {
        return cantidadarticulos;
    }

    public void setCantidadarticulos(int cantidadarticulos) {
        this.cantidadarticulos = cantidadarticulos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
