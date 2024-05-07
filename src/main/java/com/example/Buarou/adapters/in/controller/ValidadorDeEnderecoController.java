package com.example.Buarou.adapters.in.controller;

import com.example.Buarou.adapters.in.mapper.PessoaMapperController;
import com.example.Buarou.adapters.in.request.PessoaRequest;
import com.example.Buarou.application.ports.InputPorts.ValidadorEnderecoPessoaInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/validador")
public class ValidadorDeEnderecoController {
    private ValidadorEnderecoPessoaInputPort validadorEnderecoPessoaInputPort;
    private PessoaMapperController pessoaMapperController;
    @Autowired
    public ValidadorDeEnderecoController(ValidadorEnderecoPessoaInputPort validadorEnderecoPessoaInputPort, PessoaMapperController pessoaMapperController) {
        this.validadorEnderecoPessoaInputPort = validadorEnderecoPessoaInputPort;
        this.pessoaMapperController = pessoaMapperController;
    }
    @PostMapping
    public ResponseEntity<Void> enderecoValidador(@RequestBody PessoaRequest pessoaRequest){
        var domain = pessoaMapperController.converteDePessoaRequestParaPessoaDomain(pessoaRequest);
        validadorEnderecoPessoaInputPort.validadorDeEndereco(domain);
        return ResponseEntity.ok().build();
    }

}
