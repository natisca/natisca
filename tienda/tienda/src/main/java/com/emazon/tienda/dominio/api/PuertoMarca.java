package com.emazon.tienda.dominio.api;

import com.emazon.tienda.dominio.modelo.Marca;

import java.util.List;

public interface PuertoMarca {
    void guardarMarca(Marca marca);
    void eliminarMarca(long id);
    void actualizarMarca(Marca marca);
    List<Marca> listarMarcas();
    Marca obtenerMarca(long id);
}
