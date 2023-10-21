package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getHistoric() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/historic", String.class);
        StringBuilder answer= new StringBuilder();
        try{
            File resource = new File("./src/main/resources/historic/historic.txt");
            Scanner scanner = new Scanner(resource);
            while(scanner.hasNext())
            {
                answer.append(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertThat(response.getBody()).isEqualTo(answer.toString());
    }
    @Test
    public void getRomantic() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/romantic", String.class);
        StringBuilder answer= new StringBuilder();
        try{
            File resource = new File("./src/main/resources/romantic/romantic.txt");
            Scanner scanner = new Scanner(resource);
            while(scanner.hasNext())
            {
                answer.append(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertThat(response.getBody()).isEqualTo(answer.toString());
    }

    @Test
    public void getScifi() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/scifi", String.class);
        StringBuilder answer= new StringBuilder();
        try{
            File resource = new File("./src/main/resources/scifi/scifi.txt");
            Scanner scanner = new Scanner(resource);
            while(scanner.hasNext())
            {
                answer.append(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertThat(response.getBody()).isEqualTo(answer.toString());
    }

}
