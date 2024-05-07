package adapters.out.client;

import application.core.domain.PessoaDomain;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "nome-do-servico", url = "url-do-servico")
public interface OutroServicoClient {

    @PostMapping("/endpoint-do-servico")
    void obterDados(@RequestBody PessoaDomain pessoaDomain);
}
