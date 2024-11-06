package br.com.jonatanrosario.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Gerenciamento de Produtos API.")
                .version("1.0")
                .description("API para realizar operações de CRUD (Create, Read, Update, Delete) em um sistema de gerenciamento de produtos. \n" +
                        "Permite o cadastro, consulta, atualização e exclusão de produtos no banco de dados, oferecendo uma solução simples e eficiente para gerenciar o catálogo de produtos.")
                .contact(new Contact()
                        .name("Jonatan Rosário")
                        .url("https://github.com/JonatanRosario/api_java")
                        .email("jonatan.2412014@aluno.faculdadedescomplica.com.br")));
    }
}
