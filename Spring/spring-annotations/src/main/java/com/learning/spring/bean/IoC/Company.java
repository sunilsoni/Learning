package com.learning.spring.bean.IoC;

import com.learning.spring.bean.Traditional.Address;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }
}