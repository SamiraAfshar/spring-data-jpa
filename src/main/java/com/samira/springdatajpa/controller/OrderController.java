package com.samira.springdatajpa.controller;

import com.samira.springdatajpa.dto.OrderRequest;
import com.samira.springdatajpa.dto.OrderResponse;
import com.samira.springdatajpa.entity.Customer;
import com.samira.springdatajpa.repository.CustomerRepository;
import com.samira.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getAllOrders")
    public List<OrderResponse> getAllOrders(){
        return customerRepository.getJoinInformation();
    }

//    public OrderController(CustomerRepository customerRepository){
//        this.customerRepository = customerRepository;
//    }


}
