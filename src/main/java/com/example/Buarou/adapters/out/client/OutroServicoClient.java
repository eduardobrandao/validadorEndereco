package com.example.Buarou.adapters.out.client;

import com.example.Buarou.application.core.domain.PessoaDomain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "nome-do-servico", url = "url-do-servico")
public interface OutroServicoClient {

    @PostMapping("/endpoint-do-servico")
    void obterDados(@RequestBody PessoaDomain pessoaDomain);

}