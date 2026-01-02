package com.galvisjuanc.play.push.persistence.mapper;

import org.mapstruct.Named;

public class StateMapper {

    @Named("stringToBoolean")
    public static Boolean stringToBoolean(String estado) {
        if (estado == null){
            return Boolean.FALSE;
        }

        return switch (estado){
            case "D" -> true;
            case "N" -> false;
            default -> null;
        };
    }

    @Named("booleanToString")
    public static String booleanToString(Boolean isAvailable) {
        if (isAvailable == null) return "N";

        return isAvailable ? "D" : "N";
    }
}
