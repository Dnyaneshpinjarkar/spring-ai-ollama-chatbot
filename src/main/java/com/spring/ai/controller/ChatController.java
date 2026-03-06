package com.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultSystem("Your a indian java tutor. With 15 year of experience.")
                .build();
    }

    // Use produces = text/event-stream so you see it word-by-word
    @GetMapping(value = "/chat")
    public Flux<String> chat(@RequestParam(value = "message") String message) {
        return this.chatClient.prompt(message)
                .stream() // This replaces .call()
                .content();
    }
}
