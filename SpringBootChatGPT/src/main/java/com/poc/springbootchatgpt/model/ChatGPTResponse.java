package com.poc.springbootchatgpt.model;

import lombok.Data;

import java.util.List;

@Data
public class ChatGPTResponse {
    private List<ChatGptChoice> choices;
}
