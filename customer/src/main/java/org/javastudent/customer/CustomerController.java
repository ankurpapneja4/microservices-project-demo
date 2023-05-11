package org.javastudent.customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public Customer registerCustomer(@RequestBody Customer customer){
        customerService.registerCustomer(customer);
        return customer;
    }

}
