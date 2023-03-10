package com.morais.cleanarch.core.dataprovider;

import com.morais.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
