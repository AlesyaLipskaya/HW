package org.example.xmlParsing.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JacksonTest {

    static ObjectMapper objectMapper = new ObjectMapper();

    static void pojoToJsonString() throws JsonProcessingException {
        JacksonEmployee employee = new JacksonEmployee("Mark", "James", 20);
        String json = objectMapper.writeValueAsString(employee);
        System.out.println(json);

        String employeeJson = """
            {
            "firstName" : "Jalil",
            "lastName" : "Jarjanazy",
            "age" : 30
            }
            """;
        JacksonEmployee employee2 = objectMapper.readValue(employeeJson, JacksonEmployee.class);
        System.out.println(employee2);

        File file = new File("src/main/java/org/example/xmlParsing/json/employees.json");
        try {
            List<JacksonEmployee> employeeList = objectMapper.readValue(file, new TypeReference<>(){});
            System.out.println(employeeList.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws JsonProcessingException {
        pojoToJsonString();
    }
}
