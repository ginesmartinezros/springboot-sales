package com.pbenito.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    // Definimos el token secreto
    String SECRET_TOKEN_PBENITO = System.getenv("SECRET_TOKEN_PBENITO");

    @GetMapping("/api/test")
    public ResponseEntity<Map<String, String>> getData(
            @RequestHeader(value = "Authorization", required = false) String token) {

        // Verifica si el token está presente y es válido
        if (token == null || !token.equals(SECRET_TOKEN_PBENITO)) {
            // Si no es válido o falta, devuelve un error 401 (Unauthorized)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        // Si el token es válido, creamos un mapa con los datos que queremos devolver en
        // JSON
        Map<String, String> data = new HashMap<>();
        data.put("message", "Acceso concedido");
        data.put("status", "success");

        // Devolvemos una respuesta con el JSON y un estado 200 (OK)
        return ResponseEntity.ok(data);
    }
}
