package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerGetRes {
    private int custId;
    private String name;
    private String address;
    private String phone;
}
