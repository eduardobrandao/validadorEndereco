package adapters.in.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoRequest {
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;
    private String logradouro;
    private String numero;
}
