package application.core.usecase;

import application.core.domain.PessoaDomain;
import application.ports.InputPorts.ValidadorEnderecoPessoaInputPort;
import application.ports.OutputPorts.ValidadorEnderecoPessoaOutPutPort;

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
