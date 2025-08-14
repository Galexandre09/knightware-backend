package br.com.knightware.knightware_backend.controller;

import br.com.knightware.knightware_backend.model.DefaultReturn;
import br.com.knightware.knightware_backend.model.dto.ClientDTO;
import br.com.knightware.knightware_backend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta classe é uma controller REST
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/hello") // GET /api/hello
    public String sayHello() {
        return "Olá, Spring!";
    }

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return "Olá, " + principal.getAttribute("login") + "! Seu GitHub ID é " + principal.getAttribute("id");
    }

    @PostMapping
    public DefaultReturn<ClientDTO> cadastrarCliente(@RequestBody ClientDTO dto){
        return clientService.registerCustomer(dto);
    }
}
