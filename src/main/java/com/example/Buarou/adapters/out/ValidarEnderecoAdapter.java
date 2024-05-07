package com.example.Buarou.adapters.out;

import com.example.Buarou.adapters.out.client.OutroServicoClient;
import com.example.Buarou.application.core.domain.PessoaDomain;
import com.example.Buarou.application.ports.OutputPorts.ValidadorEnderecoPessoaOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarEnderecoAdapter implements ValidadorEnderecoPessoaOutPutPort {
    private final OutroServicoClient outroServicoClient;
    @Autowired
    public ValidarEnderecoAdapter(OutroServicoClient outroServicoClient) {
        this.outroServicoClient = outroServicoClient;
    }

    @Override
    public void validadorDeEndereco(PessoaDomain pessoaDomain) {
        outroServicoClient.obterDados(pessoaDomain);
    }
}
