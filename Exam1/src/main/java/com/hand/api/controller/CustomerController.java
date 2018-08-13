package com.hand.api.controller;

import com.hand.api.service.AddressService;
import com.hand.api.service.CustomerService;
import com.hand.domain.entity.Address;
import com.hand.domain.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private AddressService addressService;

    // 添加一个数据
    @PostMapping(value = "/add")
    @ResponseBody
    public int dbTestAdd(@RequestParam("lastName") String lastName,
                         @RequestParam("firstName") String firstName,
                         @RequestParam("email") String email,
                         @RequestParam("address") String address) {

        System.out.println(addressService.findAddressId(address));
        short addressId = addressService.findAddressId(address);
        System.out.println("addressId" + addressId);

        Customer customer = new Customer();

        customer.setActive(true);
        customer.setEmail(email);
        customer.setLastName(lastName);
        customer.setFirstName(firstName);
        customer.setAddressId(addressId);


        return customerService.save(customer);
    }

    @ResponseBody
    @RequestMapping(value = "/test/{id}")
    public Address test(@PathVariable("id") short id){
        return addressService.selectByPrimaryKey1(id);
    }
}
