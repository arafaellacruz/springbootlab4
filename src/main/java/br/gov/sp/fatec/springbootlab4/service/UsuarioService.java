package br.gov.sp.fatec.springbootlab4.service;

import java.util.List;

import br.gov.sp.fatec.springbootlab4.entity.Usuario;

public interface UsuarioService {

    public Usuario novo(Usuario usuario);

    public List<Usuario> buscarTodos();

    public Usuario buscarPorId(Long id);
    
}