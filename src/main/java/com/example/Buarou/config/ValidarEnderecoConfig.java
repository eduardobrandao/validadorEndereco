package com.example.Buarou.config;

import com.example.Buarou.application.core.usecase.ValidarEnderecoPessoaUseCase;
import com.example.Buarou.application.ports.OutputPorts.ValidadorEnderecoPessoaOutPutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ValidarEnderecoConfig {

    @Bean
    public ValidarEnderecoPessoaUseCase validarEnderecoPessoaUseCase(ValidadorEnderecoPessoaOutPutPort outPutPort) {
        return new ValidarEnderecoPessoaUseCase(outPutPort);
    }

}
