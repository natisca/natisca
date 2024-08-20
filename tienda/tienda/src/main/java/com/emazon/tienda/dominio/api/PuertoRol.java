package com.emazon.tienda.dominio.api;

import com.emazon.tienda.dominio.modelo.Rol;

import java.util.List;

public interface PuertoRol {
    void guardarRol(Rol rol);
    void eliminarRol(long id);
    void actualizarRol(Rol rol);
    List<Rol> listarRoles();
    Rol obtenerRol(long id);
}
