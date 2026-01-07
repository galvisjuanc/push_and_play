package com.galvisjuanc.play.push.persistence.mapper;

import com.galvisjuanc.play.push.domain.dto.MovieDto;
import com.galvisjuanc.play.push.persistence.entity.MovieEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {GenreMapper.class,
                StateMapper.class})
public interface MovieMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(source = "duration", target = "duration")
    @Mapping(source = "genre", target = "genre", qualifiedByName = "stringToGenre")
    @Mapping(source = "releaseDate", target = "releaseDate")
    @Mapping(source = "clasificacion", target = "rating")
    @Mapping(source = "state", target = "state", qualifiedByName = "stringToBoolean")
    MovieDto toDto(MovieEntity movieEntity);

    @InheritConfiguration
    @Mapping(source = "genre", target = "genre", qualifiedByName = "genreToString")
    MovieEntity toEntity(MovieDto movieDto);

    List<MovieDto> toDto(Iterable<MovieEntity> movieEntities);
}
