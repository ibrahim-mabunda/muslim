package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("Database URL: " + System.getenv("DATABASE_URL"));
        System.out.println("Database Host: " + System.getenv("DATABASE_HOST"));
        System.out.println("Database Port: " + System.getenv("DATABASE_PORT"));
        System.out.println("Database Name: " + System.getenv("DATABASE_NAME"));
        System.out.println("Database User: " + System.getenv("DATABASE_USER"));
        SpringApplication.run(Application.class, args);
    }

}
