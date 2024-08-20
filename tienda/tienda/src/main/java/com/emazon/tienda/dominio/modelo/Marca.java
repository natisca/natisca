package com.emazon.tienda.dominio.modelo;

public class Marca {
    @lombok.Setter
    @lombok.Getter
    private Long id;
    private String nombre;
    @lombok.Setter
    @lombok.Getter
    private String descripcion;

    public Marca(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
