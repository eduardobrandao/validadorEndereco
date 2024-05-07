package adapters.in.mapper;

import adapters.in.request.PessoaRequest;
import application.core.domain.PessoaDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapperController {
    PessoaDomain converteDePessoaRequestParaPessoaDomain(PessoaRequest pessoaRequest);
}
