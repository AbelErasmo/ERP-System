package com.erp.sistema.erp;
    
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableWebSecurity
public class Security {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
            .csrf(csrf -> csrf.disable());
        return http.build();
    }


    // @Bean
    // public UserDetailsService users() {
    //     return new InMemoryUserDetailsManager(
    //         User.withUsername("admin")
    //             .password("{noop}admin123")
    //             .roles("USER")
    //             .build()
    //     );
    // }
}
