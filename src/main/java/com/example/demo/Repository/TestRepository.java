package com.example.demo.Repository;

import com.example.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Address,Long> {
    public void deleteById(Long id);
    public Address findById(long id);


}
