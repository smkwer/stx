package com.stx.mapper;


import com.stx.domain.Contract;

import java.util.List;

/**
 * @author fsl
 */

public interface ContractMapper {
    int add(Contract contract);
    List<Contract> getUserList();
    int update(Contract contract);
    int delete(String id);
}
