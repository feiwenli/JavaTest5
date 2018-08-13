package com.hand.infra.mapper;

import com.hand.domain.entity.Address;
import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Short addressId);

    int insert(Address record);

    Address selectByPrimaryKey(short addressId);

    List<Address> selectAll();

    int updateByPrimaryKey(Address record);

    short selectByAddress(String address);

}