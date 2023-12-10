package pl.pingwit.lesson19.task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
// код нужно отформатировать
public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ATM[] atm = objectMapper.readValue(new File("src/main/java/pl/pingwit/lesson19/task2/atms.json"), ATM[].class);
        System.out.println(Arrays.toString(atm));
    }
}
