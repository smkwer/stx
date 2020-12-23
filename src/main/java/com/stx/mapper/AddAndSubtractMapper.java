package com.stx.mapper;


import com.stx.domain.AddAndSubtract;

import java.util.List;

/**
 * @author fsl
 */
public interface AddAndSubtractMapper {
    int add(AddAndSubtract addAndSubtract);
    List<AddAndSubtract> getUserList();
    int update(AddAndSubtract addAndSubtract);
    int delete(String id);
}
