package com.emazon.tienda.dominio.spi;

import com.emazon.tienda.dominio.modelo.Marca;

import java.util.List;

public interface AdaptadorMarca {
    void guardarMarca(Marca marca);
    List<Marca> listarMarcas();
    Marca buscarMarcaPorId(long id);
    void eliminarMarcaPorId(long id);
    void actualizarMarca(Marca marca);



}
