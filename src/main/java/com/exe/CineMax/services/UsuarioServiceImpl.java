package com.exe.CineMax.services;

import com.exe.CineMax.repositories.UsuarioEntity;
import com.exe.CineMax.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    public UsuarioRepository ur;
    @Override
    public List<UsuarioEntity> getListaUsuario() {
        return ur.findAll();
    }

    @Override
    public Optional<UsuarioEntity> getUsuario(int id) {
        return Optional.empty();
    }

    @Override
    public UsuarioEntity agregarUsuario(UsuarioEntity usuarioEntity) {
        return null;
    }

    @Override
    public void modificarUsuario(UsuarioEntity usuarioEntity) {

    }

    @Override
    public void eliminarUsuario(int id) {

    }
}
