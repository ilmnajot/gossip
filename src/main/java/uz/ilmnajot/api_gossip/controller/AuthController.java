package uz.ilmnajot.api_gossip.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ilmnajot.api_gossip.dto.ProfileDTO;
import uz.ilmnajot.api_gossip.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public HttpEntity<?> register(@Valid @RequestBody ProfileDTO profileDTO){
        HttpEntity<?> register = authService.register(profileDTO);
        return ResponseEntity.ok(register);
    }
}
