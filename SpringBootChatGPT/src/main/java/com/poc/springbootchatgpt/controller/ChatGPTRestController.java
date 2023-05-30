package com.poc.springbootchatgpt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springbootchatgpt.model.SearchRequest;
import com.poc.springbootchatgpt.service.ChatGPTService;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ChatGPTRestController {

    private ChatGPTService chatGPTService;

    public ChatGPTRestController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/searchQuery")
    public String searchChatGPT(@RequestBody SearchRequest searchRequest) {

        log.info("searchChatGPT Started query: " + searchRequest.getQuery());

        return chatGPTService.processSearch(searchRequest.getQuery());

    }

}
