package com.antepastocompany.antepastoapi.mapper;

import com.antepastocompany.antepastoapi.dto.request.AntepastoDTO;
import com.antepastocompany.antepastoapi.entity.Antepasto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AntepastoMapper {

    AntepastoMapper INSTANCE = Mappers.getMapper(AntepastoMapper.class);

    Antepasto toModel(AntepastoDTO antepastoDTO);

    AntepastoDTO toDTO(Antepasto antepasto);

}
