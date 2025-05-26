package com.erp.sistema.erp.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Configuração dos endpoints: apenas auntetica requisições para "/usuarios/**"
            .authorizeHttpRequests(authorize -> authorize.requestMatchers("/usuarios/admin").hasRole("ADMIN")
                .requestMatchers("usuarios/**").authenticated()
                .anyRequest().permitAll())
            // Configuração do servidor de recursos OAuth2 com JWT usando lambda Customizer
            .oauth2ResourceServer(oath2 -> oath2.jwt(Customizer.withDefaults()))
            // Desabilita CSRF para APIs RESTful
            .csrf(csrf -> csrf.disable())
            // Configuração do Http Basic (Usando o lambda)
            .httpBasic(Customizer.withDefaults());
        
        return http.build();
    }
}
