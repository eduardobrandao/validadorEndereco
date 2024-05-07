package adapters.in.request;

import application.core.domain.EnderecoDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {
    private String cpf;
    private String nome;
    private String nomeMae;
    private Date dataNascimento;
    private EnderecoRequest enderecoResidencial;
    private String ticket;
    private String hash;
}
