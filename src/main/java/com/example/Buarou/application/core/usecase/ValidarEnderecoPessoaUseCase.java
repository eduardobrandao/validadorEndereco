package com.example.Buarou.application.core.usecase;

import com.example.Buarou.application.core.domain.PessoaDomain;
import com.example.Buarou.application.ports.InputPorts.ValidadorEnderecoPessoaInputPort;
import com.example.Buarou.application.ports.OutputPorts.ValidadorEnderecoPessoaOutPutPort;

public class ValidarEnderecoPessoaUseCase implements ValidadorEnderecoPessoaInputPort {
    private final ValidadorEnderecoPessoaOutPutPort validadorEnderecoPessoaOutPutPort;

    public ValidarEnderecoPessoaUseCase(ValidadorEnderecoPessoaOutPutPort validadorEnderecoPessoaOutPutPort) {
        this.validadorEnderecoPessoaOutPutPort = validadorEnderecoPessoaOutPutPort;
    }


    @Override
    public void validadorDeEndereco(PessoaDomain pessoaDomain) {
        validadorEnderecoPessoaOutPutPort.validadorDeEndereco(pessoaDomain);
    }
}
