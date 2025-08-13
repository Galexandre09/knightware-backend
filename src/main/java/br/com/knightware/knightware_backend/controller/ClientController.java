package br.com.knightware.knightware_backend.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que esta classe é uma controller REST
@RequestMapping("/client")
public class ClientController {
    @GetMapping("/hello") // GET /api/hello
    public String sayHello() {
        return "Olá, Spring!";
    }

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return "Olá, " + principal.getAttribute("login") + "! Seu GitHub ID é " + principal.getAttribute("id");
    }
}
