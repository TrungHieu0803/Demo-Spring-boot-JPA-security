package com.example.demo.service.implement;

import com.example.demo.Repository.TestRepository;
import com.example.demo.dto.AddressDto;
import com.example.demo.entity.Address;
import com.example.demo.service.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class addressImp implements addressService {

    @Autowired
    TestRepository addressRepo;


    @Override
    public void saveAddress(AddressDto addressDto) {
        Address address = new Address(addressDto.getCity(),addressDto.getProvince());
        address= addressRepo.save(address);
    }

    @Override
    public void delete(Long id) {
        addressRepo.deleteById(id);
    }

    @Override
    public void update(AddressDto addressDto,long id) {
        Address address = addressRepo.findById(id);
        address.setCity(addressDto.getCity());
        address.setProvince(addressDto.getProvince());
        addressRepo.save(address);
    }

    @Override
    public AddressDto getList(long id) {
        Address address = addressRepo.findById(id);
        AddressDto addressDto = new AddressDto(address.getCity(),address.getProvince());
        return addressDto;
    }
}
