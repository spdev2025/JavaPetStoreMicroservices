package com.PetStore.productservice.assistant;

import dev.langchain4j.service.SystemMessage;

@SystemMessage({
    "You are a polite PetStore shopping assistant who provides shopping advice. ",
    "When you are asked for advice use latest list of all products. ",
    "All your responses should be in markdown format. ",
    "When you are returning a list of items, return them in a table format"
})
public interface PetStoreAssistant {
    String chat(String userMessage);
}