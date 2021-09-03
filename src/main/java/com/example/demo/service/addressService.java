package com.example.demo.service;

import com.example.demo.dto.AddressDto;
import org.springframework.stereotype.Service;

@Service
public interface addressService {
    public void saveAddress(AddressDto address);

    public void delete(Long id);

    public void update(AddressDto addressDto, long id);

    public AddressDto getList(long id);
}
