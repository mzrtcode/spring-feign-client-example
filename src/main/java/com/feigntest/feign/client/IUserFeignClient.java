package com.feigntest.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClient.class)
public interface IUserFeignClient {


}
