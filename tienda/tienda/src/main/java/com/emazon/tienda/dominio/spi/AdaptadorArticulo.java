package com.emazon.tienda.dominio.spi;

import com.emazon.tienda.dominio.modelo.Articulo;

import java.util.List;

public interface AdaptadorArticulo {
    void guardarArticulo(Articulo articulo);
    List<Articulo> listarArticulos();
    Articulo buscarArticuloPorId(long id);
    void eliminarArticuloPorId(long id);
    void actualizarArticulo(Articulo articulo);


}
