package com.github.jotagit.controller.impl;

import com.github.jotagit.service.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtor")
public class Controlador {

    @Autowired
    Servico servicoImpl;

    @PostMapping("/{msg}")
    @ResponseBody
    public Boolean produtor(@PathVariable("msg") String mensagem){

        return servicoImpl.publicarEventoBasico(mensagem);
    }



}
