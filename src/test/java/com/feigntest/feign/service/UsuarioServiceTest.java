package com.feigntest.feign.service;

import com.feigntest.feign.client.IUserFeignClient;
import com.feigntest.feign.dto.UserDto;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private IUserFeignClient client;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    void getAllUsers_Exitoso() {
        UserDto userOne = new UserDto(1L, "Juan", "avatar");
        UserDto userTwo = new UserDto(2L, "Andres", "avatar");

        List<UserDto> userList = List.of(userOne, userTwo);

        when(client.getUsers()).thenReturn(userList);
        List<UserDto> result = client.getUsers();

        verify(client, times(1)).getUsers();
        
        assertEquals(userList, result);


    }
}