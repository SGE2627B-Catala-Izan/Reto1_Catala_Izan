package com.iesdoctorbalmis.spring.controller;

import com.iesdoctorbalmis.spring.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    // Inyección por constructor
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        return "clientes/lista";  // → templates/clientes/lista.html
    }
}