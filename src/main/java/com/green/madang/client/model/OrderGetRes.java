package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderGetRes {
    @JsonProperty("order_id")
    private int orderId;
    @JsonProperty("sale_price")
    private int salePrice;
    @JsonProperty("order_date")
    private String orderDate;
    @JsonProperty("book_id")
    private int bookId;
    @JsonProperty("book_name")
    private String bookName;
}
