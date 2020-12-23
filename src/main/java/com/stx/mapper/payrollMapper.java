package com.stx.mapper;


import com.stx.domain.Payroll;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface payrollMapper {

    /**
     * 增加一条Payroll表记录
     * @param payroll
     * @return
     */
    int insertPayroll(Payroll payroll);

    /**
     * 删除一条Payroll表记录
     * @param payroll
     * @return
     */
    int deletePayroll(Payroll payroll);

    /**
     * 根据ID修改用户信息
     * @param id
     * @param payroll
     * @return
     */
    int updatePayroll(@Param("id") String id, @Param("contract") Payroll payroll);

    /**
     * 查找Payroll表所有记录
     * @return
     */
    List<Payroll> findAll();
}
