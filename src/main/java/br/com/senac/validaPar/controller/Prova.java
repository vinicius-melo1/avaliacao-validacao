package br.com.senac.validaPar.controller;

import br.com.senac.validaPar.dtos.ProvaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin
public class Prova {
    @GetMapping("/validarNumero")
    public ResponseEntity<ProvaDTO> validar(@RequestParam Double numero) {
        ProvaDTO resultado = new ProvaDTO();
        double restoDivisao;

        if (numero %2==0) {
            resultado.setRestoDivisao(numero%2);
            resultado.setImparPar("Par");
        } else {
            resultado.setRestoDivisao(numero%2);
            resultado.setImparPar("Ímpar");
        }
        return ResponseEntity.ok(resultado);
    }
}
