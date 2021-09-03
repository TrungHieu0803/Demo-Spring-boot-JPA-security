package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.service.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class addressController {
    @Autowired
    private addressService addressService;

    @GetMapping("/address")
    public void saveAddress(@RequestBody AddressDto model){
        addressService.saveAddress(model);
    }

    @DeleteMapping("/address/{id}")
    public void delete(@PathVariable long id){
        addressService.delete(id);
    }

    @PutMapping("/address/{id}")
    public void update(@RequestBody AddressDto model, @PathVariable long id){
        System.out.println(id);
        addressService.update(model,id);
    }

    @PostMapping("/address/{id}")
    public ResponseEntity<?> getAddrees(@PathVariable long id){
        AddressDto addressDto = addressService.getList(id);
        return ResponseEntity.ok(addressDto);
    }

}
