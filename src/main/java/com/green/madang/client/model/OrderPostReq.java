package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPostReq {
    private int custId;
    private int bookId;
    @JsonIgnore
    private int orderId;
}
