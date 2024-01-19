package com.feigntest.feign.client;

import com.feigntest.feign.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClient.class)
public interface IUserFeignClient {

    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_NDJSON_VALUE)
    List<UserDto> getUsers();
    
}
