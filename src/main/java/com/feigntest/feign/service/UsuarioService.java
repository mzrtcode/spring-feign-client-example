package com.feigntest.feign.service;

import com.feigntest.feign.client.IUserFeignClient;
import com.feigntest.feign.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final IUserFeignClient client;

    public List<UserDto> getAllUsers(){
        return client.getUsers();
    }

    public void saveUser(UserDto user){
        // TO-DO
    }

    public void udpateUser(UserDto user){

    }

    public void deleteUser(Long id){

    }
}
