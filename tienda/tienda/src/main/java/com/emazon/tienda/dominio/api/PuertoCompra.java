package com.emazon.tienda.dominio.api;

import com.emazon.tienda.dominio.modelo.Compra;

import java.util.List;

public interface PuertoCompra {
    void guardarCompra(Compra compra);
    void eliminarCompra(long id);
    void actualizarCompra(Compra compra);
    List<Compra> listarCompras();
    Compra obtenerCompra(long id);
}
