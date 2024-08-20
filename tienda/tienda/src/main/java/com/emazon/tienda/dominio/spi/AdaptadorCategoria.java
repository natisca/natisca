package com.emazon.tienda.dominio.spi;

import com.emazon.tienda.dominio.modelo.Categoria;

import java.util.List;

public interface AdaptadorCategoria {
    void guardarCategoria(Categoria categoria);
    List<Categoria> listarCategorias();
    Categoria buscarCategoriaPorId(long id);
    void eliminarCategoriaPorId(long id);
    void actualizarCategoria(Categoria categoria);
}
