package com.galvisjuanc.play.push.domain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlayPushAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestión de Peliculas {{platform}}.
            Usa menos de 120 caracteres.
            """)
    String generateGreeting(@V("platform") String platform);

    @SystemMessage("""
            Eres un experto en cine que recomienda películas personalizadas según los gustos del usuario.
            Debes recomendar máximo 3 películas.
            No incluyas películas que estén por fuera de la plataforma PlatziPlay.
            """)
    String generateMoviesSuggestion(@UserMessage String userMessage);
}
