package com.galvisjuanc.play.push.persistence.mapper;

import com.galvisjuanc.play.push.domain.Genre;

public class GenreMapper {

    public static Genre stringToGenre(String genre){
        if (genre == null) return null;

        return switch (genre.toUpperCase()) {
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "DRAMA" -> Genre.DRAMA;
            case "ANIMADA" -> Genre.ANIMATED;
            case "HORROR" -> Genre.HORROR;
            case "CIENCIA_FICCION" -> Genre.SCI_FI;
            default -> null;
        };
    }
}
