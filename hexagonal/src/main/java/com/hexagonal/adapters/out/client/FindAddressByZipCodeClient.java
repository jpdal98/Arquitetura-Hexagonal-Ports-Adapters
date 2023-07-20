package com.hexagonal.adapters.out.client;

import com.hexagonal.adapters.out.client.response.AddressReponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="FindAddressByZipCodeClient", url="${arantes.client.address.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressReponse find(@PathVariable("zipCode") String zipCode);

}
