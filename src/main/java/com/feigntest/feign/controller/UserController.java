package com.feigntest.feign.controller;

import com.feigntest.feign.dto.UserDto;
import com.feigntest.feign.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return usuarioService.getAllUsers();
    }

}
