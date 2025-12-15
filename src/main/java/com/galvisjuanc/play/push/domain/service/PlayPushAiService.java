package com.galvisjuanc.play.push.domain.service;

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
}
