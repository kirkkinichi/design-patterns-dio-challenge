package com.kirk.design_patterns.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    private int contador = 0;

    public int incrementarContador() {
        return ++contador;
    }

    public int decrementarContador() {
        return --contador;
    }

    public int getContador() {
        return contador;
    }
}
