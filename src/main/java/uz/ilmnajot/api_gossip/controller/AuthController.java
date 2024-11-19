package uz.ilmnajot.api_gossip.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/verify/{userId}")
    public HttpEntity<?> verify(@Valid @RequestBody ProfileDTO profileDTO, @PathVariable String userId){

    }
}
