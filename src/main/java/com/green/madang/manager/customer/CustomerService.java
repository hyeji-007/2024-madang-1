package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //final 멤버 필드의 생성자 자동 생성
public class CustomerService {
    private final CustomerMapper mapper;

    public int postCustomer(CustomerPostReq p) {
        return mapper.insCustomer(p);
    }

    public List<CustomerGetRes> getCustomerList(CustomerGetReq p) {
        //page 로직 처리 >> startIdx 값 세팅
        //(page - 1) * size;
//        int startIdx = (p.getPage() - 1) * p.getSize();
//        p.setStartIdx(startIdx);

        //CustomerGetReq는 immutable 객체로 만들었기 때문에 객체 안에서 startIdx값을 계산하였음.
        return mapper.selCustomerList(p);
    }

    public int putCustomer(CustomerPutReq p) {
        return mapper.updCustomer(p);
    }

    public int deleteCustomer(int custId) {
        return mapper.delCustomer(custId);
    }
}
