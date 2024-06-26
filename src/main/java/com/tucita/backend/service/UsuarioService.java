package com.tucita.backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.tucita.backend.model.Usuario;

@Service
public interface UsuarioService {
	public List<Usuario> consultarUsuarios();
	public Optional<Usuario> consultarUsuario(Long id, String usuario);
	public Optional<Usuario> consultarUsuarioPorRol(String rol);
	public Usuario crearUsuario(Usuario usuario);
	public Usuario actualizarUsuario(Usuario usuario);
	public String eliminarUsuarioPorId(Long id);
}
