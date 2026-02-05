//package com.example.security.jwtAuthentication.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class JwtSecurityConfiguration {
//
//    @Autowired
//    private JWTUtil jwtUtil;
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//                httpSecurity.csrf(crst -> crst.disable()) //No need for stateless API
//                        .authorizeHttpRequests(auth ->
//                                auth.requestMatchers("/login", "/signup").permitAll()
//                                        .requestMatchers("/auth/**").hasRole("ADMIN")
//                                        .anyRequest().authenticated())
//
//                        // Stateless session (required for JWT)
//                        .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//
//                        // Set custom authentication provider
//                        .authenticationProvider(authenticationProvider())
//
//                        // Add JWT filter before Spring Security's default filter
//                        .addFilterBefore(jwtUtil, UsernamePasswordAuthenticationFilter.class);
//        return httpSecurity.build();
//    }
//
//    /*
//     * Authentication provider configuration
//     * Links UserDetailsService and PasswordEncoder
//     */
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(passwordEncoder());
//        return provider;
//    }
//
//    /*
//     * Authentication manager bean
//     * Required for programmatic authentication (e.g., in /generateToken)
//     */
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//
//
//}
