package com.emazon.tienda.dominio.api;

import com.emazon.tienda.dominio.modelo.Usuario;

import java.util.List;

public interface PuertoUsuario {
    void guardarUsuario(Usuario usuario);
    void eliminarUsuario(long id);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario obtenerUsuario(long id);
}
