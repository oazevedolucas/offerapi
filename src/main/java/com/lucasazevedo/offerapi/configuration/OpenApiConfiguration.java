package com.lucasazevedo.offerapi.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lucasazevedo.offerapi")
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Lucas Azevedo Spring Boot + AWS(EC2/RDS)").description("Aula do canal no youtube Lucas Azevedo onde criamos uma API SPRING BOOT com RDS e Deploy EC2."));
    }
}
