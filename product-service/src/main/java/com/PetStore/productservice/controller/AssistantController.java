package com.PetStore.productservice.controller;

import com.PetStore.productservice.assistant.PetStoreAssistantImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assistant")
public class AssistantController {

    private final PetStoreAssistantImpl assistant;

    public AssistantController(PetStoreAssistantImpl assistant) {
        this.assistant = assistant;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        return assistant.chat(message);
    }
}