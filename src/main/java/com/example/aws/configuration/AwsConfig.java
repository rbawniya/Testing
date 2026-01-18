package com.example.aws.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

    private static final String SECRET_KEY = "1234";
    private static final String ACCESS_KEY_ID = "12345";
    private static final String REGION_NAME = "US-east1";
//
//    @Bean
//    public SnsClient getSns() {
//        return SnsClient.builder().region(Region.of(REGION_NAME)).
//                credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(ACCESS_KEY_ID, SECRET_KEY))).build();
//    }
}
