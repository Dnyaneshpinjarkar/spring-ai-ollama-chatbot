# spring-ai-ollama-chatbot
Spring Boot AI chatbot using Spring AI and Ollama with streaming responses

## Tech Stack

- Java
- Spring Boot
- Spring AI
- Ollama
- Qwen2.5 Coder Model
- WebFlux (Streaming)

## Features

- AI chat API
- Streaming responses
- Local LLM using Ollama

## API Endpoint

GET /chat?message=your_message

Example:

http://localhost:8080/chat?message=Explain Java multithreading

## Setup

1. Install Ollama
2. Pull model

ollama pull qwen2.5-coder:1.5b

3. Run Spring Boot application

## Author

Dnyanesh Pinjarkar
