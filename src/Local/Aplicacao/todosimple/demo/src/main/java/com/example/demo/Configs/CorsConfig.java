/*package com.example.demo.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

   @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permite solicitações de qualquer origem
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*"); // Substitua por um domínio específico ou deixe "*"

        // Permite solicitações de qualquer método (GET, POST, PUT, etc.)
        config.addAllowedMethod("*");

        // Permite headers específicos. Pode ser personalizado conforme necessário.
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    } 
}
*/