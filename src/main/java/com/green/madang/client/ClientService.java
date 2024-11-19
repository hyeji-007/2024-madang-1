package com.green.madang.client;

import com.green.madang.client.model.OrderGetReq;
import com.green.madang.client.model.OrderGetRes;
import com.green.madang.client.model.OrderPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientMapper mapper;

    public int postOrder(OrderPostReq p) {
        return mapper.insOrders(p);
    }

    public List<OrderGetRes> getOrderList(OrderGetReq p) {
        return mapper.selOrderList(p);
    }
}