package com.example.Buarou.adapters.in.mapper;

import com.example.Buarou.adapters.in.request.PessoaRequest;
import com.example.Buarou.application.core.domain.PessoaDomain;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapperController {
    PessoaDomain converteDePessoaRequestParaPessoaDomain(PessoaRequest pessoaRequest);
}
