package com.e_commerce.Store.configuration;

import com.e_commerce.Store.jwts.JwtFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityFilter {

    private final JwtFilter jwtFilter;

    final String[] PERMIT_ALL = {
            "/api/v1/auth/**",
            "/swagger-ui/**",
            "/swagger-ui.html/**",
            "/swagger-resources/**",
            "/api-docs/**",
            "/v2/api-docs/**",
            "/v3/api-docs/**",
            "/api/v1/create-order",
            "/api/v1/admin/**"
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(AbstractHttpConfigurer::disable)
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(request ->
                        request.requestMatchers(PERMIT_ALL).permitAll()
                                .anyRequest().authenticated()
                )
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

}
