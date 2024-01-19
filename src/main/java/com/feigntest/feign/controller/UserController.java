package com.feigntest.feign.controller;

import com.feigntest.feign.dto.UserDto;
import com.feigntest.feign.service.UsuarioService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return usuarioService.getAllUsers();
    }

    @PostMapping()
    public UserDto saveUser(UserDto user){
        return usuarioService.saveUser(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathParam("id") Long id, UserDto user){
        usuarioService.udpateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathParam("id") Long id){
        usuarioService.deleteUser(id);
    }




}
