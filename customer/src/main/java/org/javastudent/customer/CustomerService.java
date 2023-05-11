package org.javastudent.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
