package com.emazon.tienda.dominio.api;


import com.emazon.tienda.dominio.modelo.Articulo;

import java.util.List;

public interface PuertoArticulo {
    void guardarArticulo(Articulo articulo);
    void eliminarArticulo(long id);
    void actualizarArticulo(Articulo articulo);
    List<Articulo> listarArticulos();
    Articulo obtenerArticulo(long id);
}
