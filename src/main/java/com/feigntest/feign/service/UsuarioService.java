package com.feigntest.feign.service;

import com.feigntest.feign.client.IUserFeignClient;
import com.feigntest.feign.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final IUserFeignClient client;

    public List<UserDto> getAllUsers(){
        return client.getUsers();
    }

    public UserDto saveUser(UserDto user){
        return client.saveUser(user);
    }

    public void udpateUser(Long id, UserDto user){
        client.updateUser(id, user);
    }

    public void deleteUser(Long id){
        client.deleteUser(id);
    }
}
