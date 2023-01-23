//package com.shunyi.keycloak.finegrained.config;
//
//import jakarta.servlet.DispatcherType;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.core.GrantedAuthorityDefaults;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
///**
// * @ClassName FilterConfiguration
// * @Description TODO
// * @Author QD291NB
// * @Date 2023/1/17 15:59
// **/
//@Configuration
//@EnableWebFluxSecurity
//public class OAuth2ClientSecurityConfig {
//
//    @Bean
//    SecurityFilterChain web(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authorize) -> authorize
//                        .dispatcherTypeMatchers(DispatcherType.ERROR).hasRole("ADMIN")
//                        .anyRequest().authenticated()
//                );
//        // ...
//
//        return http.build();
//    }
//}