package com.Clase10Ejercicios.Clase10Ejercicios.models;

public class ChatGptRequest {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MessageRequest[] getMessages() {
        return messages;
    }

    public void setMessages(MessageRequest[] messages) {
        this.messages = messages;
    }

    private MessageRequest[] messages;
}
