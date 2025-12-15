package com.galvisjuanc.play.push.web.controller;

import com.galvisjuanc.play.push.domain.service.PlayPushAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String platform;
    private final PlayPushAiService playPushAiService;

    public HelloController(@Value("${spring.application.name}") String platform, PlayPushAiService playPushAiService) {
        this.platform = platform;
        this.playPushAiService = playPushAiService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.playPushAiService.generateGreeting(platform);
    }
}
