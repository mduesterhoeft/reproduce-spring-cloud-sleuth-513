package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="tax", url="http://localhost/some")
public interface SomeServiceClient {
    @RequestMapping(method = RequestMethod.POST,
            value = "/tax-calculation/sale",
            produces = "application/hal+json",
            consumes = "application/json")
    String calculateSale(String sale);
}
