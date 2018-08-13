package com.hand.infra.mapper;

import com.hand.domain.entity.Customer;
import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Short customerId);

    int insert(Customer record);

    Customer selectByPrimaryKey(short customerId);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

}