package com.example.security.basicSecurity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BasicSecurityConfiguration {

    @Value("${spring.security.user.name}")
    private String userName;

    @Value(("${spring.security.user.password}"))
    private String password;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails adminUser = User.builder().username(userName)
                .password(passwordEncoder().encode(password))
                .roles("ADMIN")
                .build();

        UserDetails userDetails = User.builder().username("local")
                .password(passwordEncoder().encode("local"))
                .roles("USER").build();

        return new InMemoryUserDetailsManager(adminUser, userDetails);
    }

   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(auth ->
                auth.requestMatchers("/users/id/**").hasRole("USER")
                        .requestMatchers("/users/get").hasRole("ADMIN")
                        .anyRequest().authenticated())
                .httpBasic();
        return httpSecurity.build();
   }
}
