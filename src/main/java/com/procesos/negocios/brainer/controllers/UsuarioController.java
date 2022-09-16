package com.procesos.negocios.brainer.controllers;


import com.procesos.negocios.brainer.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UsuarioController {


    @GetMapping(value = "/usuario/{id}")
    public Usuario getusuario(@PathVariable long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Brainer");
        usuario.setApellido("Gerena");
        usuario.setDocumento("123456789");
        usuario.setDireccion("Juan 23");
        usuario.setFechaNacimiento(new Date(2022,9,15));
        usuario.setTelefono("3138571625");
        return usuario;

    }
}
