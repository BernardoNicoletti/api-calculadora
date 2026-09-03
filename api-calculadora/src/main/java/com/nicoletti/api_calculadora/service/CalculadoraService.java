package com.nicoletti.api_calculadora.service;

import org.springframework.stereotype.Service;

import com.nicoletti.api_calculadora.dto.Operacao;
import com.nicoletti.api_calculadora.dto.Resultado;

@Service
public class CalculadoraService {

    public Resultado calcular(Operacao operacao) {

        double valor1 = operacao.getValor1();
        double valor2 = operacao.getValor2();
        String tipo = operacao.getTipo();

        double resultado;

        switch (tipo.toLowerCase()) {

            case "somar":
                resultado = valor1 + valor2;
                break;

            case "subtrair":
                resultado = valor1 - valor2;
                break;

            case "multiplicar":
                resultado = valor1 * valor2;
                break;

            case "dividir":

                if (valor2 == 0) {
                    throw new IllegalArgumentException(
                        "Não é possível realizar divisão por zero."
                    );
                }

                resultado = valor1 / valor2;
                break;

            default:
                throw new IllegalArgumentException(
                    "Tipo de operação inválido."
                );
        }

        return new Resultado(
            "Operação " + tipo + " realizada com sucesso!",
            resultado
        );
    }
}