package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityFilterAutoConfiguration.class})
@ComponentScan(basePackages = {"com.example.security.*"})
public class DemoApplication {

//    @Autowired
//    SnsClient snsClient;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//
//    @GetMapping("/publish-error")
//    public void send() {
//        PublishRequest publishRequest = PublishRequest.builder().message("Hello").topicArn("my-topic").build();
//        PublishResponse publishResponse = snsClient.publish(publishRequest);
//    }
//
//    @SqsListener("Url")
//    public void getMsg(String msg) {
//
//    }
}
