package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ReadApplicationPropertiesFile {

    @Value("${spring.server.port}")
    private int port;

    @Autowired
    Environment environment;

    public static void main(String[] args) {
       ReadApplicationPropertiesFile file = new ReadApplicationPropertiesFile();
       file.print();
    }

    void print() {
        System.out.println(port +" "+environment.getProperty("spring.server.port"));
    }
}

@ConfigurationProperties("application")
class ConfigurationClass {

}

