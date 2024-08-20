package com.emazon.tienda.dominio.spi;

import com.emazon.tienda.dominio.modelo.Compra;

import java.util.List;

public interface AdaptadorCompra {
    void guardarCompra(Compra compra);
    List<Compra> listarCompras();
    Compra buscarCompraPorId(long id);
    void eliminarCompraPorId(long id);
    void actualizarCompra(Compra compra);
}
