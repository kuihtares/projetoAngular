package io.github.kuihtares.projetoAngular.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private User user;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginRequest) {
        // Lógica de autenticação
        if (authenticate(user.getUsername(), user.getPassword())) {
            return ResponseEntity.ok("Login bem-sucedido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
        }
    }

    private boolean authenticate(String username, String password) {
        // Implementar lógica de autenticação
        return "user".equals(username) && "password".equals(password);
    }
}