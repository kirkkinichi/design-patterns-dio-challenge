package com.kirk.design_patterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirk.design_patterns.ReservaFacade;

@RestController
public class FacadeController {
    
    @GetMapping("/reservarViagem")
    public String reservarViagem() {
        ReservaFacade reservaFacade = new ReservaFacade();
        return reservaFacade.reservaCompletada();
    }
}
