package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

@RestController
public class MainController {

    private static final Logger LOGGER = Logger.getLogger( MainController.class.getName() );

    @GetMapping("/historic")
    public String historic() {
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
        return answer.toString();
    }
    @GetMapping("/romantic")
    public String romantic() {
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
        return answer.toString();
    }

    @GetMapping("/scifi")
    public String scifi() {
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
        return answer.toString();
    }

}
