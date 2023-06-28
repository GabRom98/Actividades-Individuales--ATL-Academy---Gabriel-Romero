package com.Clase10Ejercicios.Clase10Ejercicios.models;

public class MessageRequest {
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String role;
    private String content;


}
