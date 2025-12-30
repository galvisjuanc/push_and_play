package com.galvisjuanc.play.push.persistence.mapper;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.persistence.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    @Mapping(source = "title", target = "title")
    MovieDto toDto(MovieEntity movieEntity);
}
