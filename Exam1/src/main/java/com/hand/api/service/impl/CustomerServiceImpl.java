package com.hand.api.service.impl;

import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Customer;
import com.hand.infra.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int save(Customer customer) {
        return customerMapper.insert(customer);
    }
}
