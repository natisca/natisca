package com.emazon.tienda.dominio.api;

import com.emazon.tienda.dominio.modelo.Categoria;

import java.util.List;

public interface PuertoCategoria {
    void guardarCategoria(Categoria categoria);
    void eliminarCategoria(long id);
    void actualizarCategoria(Categoria categoria);
    List<Categoria> listarCategorias();
    Categoria obtenerCategoria(long id);
}
