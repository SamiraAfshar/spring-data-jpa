package com.samira.springdatajpa.repository;

import com.samira.springdatajpa.dto.OrderResponse;
import com.samira.springdatajpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.samira.springdatajpa.dto.OrderResponse( c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}

