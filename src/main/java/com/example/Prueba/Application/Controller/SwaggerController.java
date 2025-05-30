package com.example.Prueba.Application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")

public class SwaggerController {

    @GetMapping("/info")
    public String obtenerInfo() {
        return "✅ Bienvenido a la API RESTful con Swagger + Spring Boot. Visita /swagger-ui.html para ver la documentación.";
    }

    @GetMapping("/status")
    public String status() {
        return "🚀 API funcionando correctamente.";
    }

}
