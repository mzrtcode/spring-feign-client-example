package com.feigntest.feign.client;

import com.feigntest.feign.configuration.FeignClientConfig;
import com.feigntest.feign.dto.UserDto;
import jakarta.websocket.server.PathParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface IUserFeignClient {

    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> getUsers();

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto saveUser(@RequestBody UserDto userDto);

    @PutMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void updateUser(@PathParam("id") Long id, @RequestBody UserDto userDto);
    
    @DeleteMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void deleteUser(@PathParam("id") Long id);
    
}
