package de.florianstendel.apps.examples.flowable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ExampleApplication {

    private static Logger _logger = LoggerFactory.getLogger(ExampleApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class,args);
    }
}
