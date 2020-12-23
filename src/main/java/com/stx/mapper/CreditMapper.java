package com.stx.mapper;


import com.stx.domain.Credit;

import java.util.List;

public interface CreditMapper {
    int add(Credit credit);
    List<Credit> getUserList();
    int update(Credit credit);
    int delete(String id);
}
