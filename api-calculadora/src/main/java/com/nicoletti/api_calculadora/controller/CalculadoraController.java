package com.nicoletti.api_calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nicoletti.api_calculadora.dto.Operacao;
import com.nicoletti.api_calculadora.dto.Resultado;
import com.nicoletti.api_calculadora.service.CalculadoraService;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService servico;

    @PostMapping("/calcular")
    public Resultado calcular(@RequestBody Operacao operacao) {
        return servico.calcular(operacao);
    }
}