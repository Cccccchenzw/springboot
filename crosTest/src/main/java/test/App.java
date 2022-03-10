package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
@Component
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
