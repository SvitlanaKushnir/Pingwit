package pl.pingwit.lesson19.task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lesson12.task5.MyException;
import pl.pingwit.lesson19.task2.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // здесь нужно написать код, чтобы спросить у пользователя город, где искать банкоматы, и потом подставить в шаблон
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atm in which city you are looking for?");
        String cityName = scanner.nextLine();
        String urlTemplate = String.format("https://belarusbank.by/api/atm?city=%s", cityName);

        try {

            String jsonResponse = sendHttpGetRequest(urlTemplate);

            ATM[] atms = parseJsonResponse(jsonResponse);

            // Display the parsed objects
            for (ATM obj : atms) {
                System.out.println(obj);
            }

        } catch (IOException | NullPointerException e) {
            throw new MyException("Sorry, this city doesn't have any atm");
        }
    }

    private static String sendHttpGetRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } else {
            throw new IOException("HTTP GET request failed with response code: " + responseCode);
        }
    }

    private static ATM[] parseJsonResponse(String jsonResponse) throws IOException {
        // допишите метод
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonResponse, ATM[].class);
    }
}
