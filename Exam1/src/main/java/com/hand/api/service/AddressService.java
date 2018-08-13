package com.hand.api.service;

import com.hand.domain.entity.Address;

public interface AddressService {

    short findAddressId(String address);

    Address selectByPrimaryKey1(short id);
}
