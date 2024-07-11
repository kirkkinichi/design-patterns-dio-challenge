package com.kirk.design_patterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kirk.design_patterns.service.SingletonService;

@RestController
public class SingletonController {

    @Autowired
    private SingletonService singletonService;

    @GetMapping("/incrementar")
    public String incrementarContador() {
        int contador = singletonService.incrementarContador();
        return "Contador = " + contador;
    }

    @GetMapping("/decrementar")
    public String decrementarContador() {
        int contador = singletonService.decrementarContador();
        return "Contador = " + contador;
    }

    @GetMapping("/contador")
    public String getContador() {
        int contador = singletonService.getContador();
        return "Valor atual do contador = " + contador;
    }
}
