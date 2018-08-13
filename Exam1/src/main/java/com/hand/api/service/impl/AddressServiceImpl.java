package com.hand.api.service.impl;

import com.hand.api.service.AddressService;
import com.hand.domain.entity.Address;
import com.hand.infra.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public short findAddressId(String address) {
        return addressMapper.selectByAddress(address);
    }

    @Override
    public Address selectByPrimaryKey1(short id) {
        return addressMapper.selectByPrimaryKey(id);
    }


}
