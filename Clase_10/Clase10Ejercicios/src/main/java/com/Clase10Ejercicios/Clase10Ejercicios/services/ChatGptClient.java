package com.Clase10Ejercicios.Clase10Ejercicios.services;

import com.Clase10Ejercicios.Clase10Ejercicios.models.ChatGptRequest;
import com.Clase10Ejercicios.Clase10Ejercicios.models.MessageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGptClient {
    public String enviarPregunta(String pregunta) {
        String respuestaDeChatGpt = "";
        try {
            // URL de la API de ChatGPT
            URL url = new URL("https://api.openai.com/v1/chat/completions");

            // Establecer la conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            // Establecer los encabezados de la solicitud
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer "+ APIKEY);

            connection.setDoOutput(true);
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

            // Crear el cuerpo de la solicitud
            ChatGptRequest chatGptRequest = new ChatGptRequest();
            chatGptRequest.setModel("gpt-3.5-turbo");

            MessageRequest messageRequest[] = new MessageRequest[1];
            messageRequest[0]= new MessageRequest();
            messageRequest[0].setContent(pregunta);
            messageRequest[0].setRole("system");

            chatGptRequest.setMessages(messageRequest);

            ObjectMapper objectMapper = new ObjectMapper();


            String requestBody = objectMapper.writeValueAsString(chatGptRequest);
            System.out.println(requestBody);
            // Enviar la solicitud
            outputStream.writeBytes(requestBody);
            outputStream.flush();
            outputStream.close();

            // Obtener la respuesta
            int responseCode = connection.getResponseCode();
            BufferedReader inputReader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                inputReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            // Leer la respuesta línea por línea
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }
            inputReader.close();
            // Imprimir la respuesta
            System.out.println(response.toString());
            respuestaDeChatGpt = response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respuestaDeChatGpt;
    }
}
