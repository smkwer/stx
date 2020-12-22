package com.stx.mapper;

import com.stx.domain.Employee;

import java.util.List;

/**
 * @author ChengXing
 * @Date Created in 20:24 2020/12/21
 * @Description stx
 */
public interface EmployeeMapper {
    /**
     * 查询所有教师信息
     *
     * @return
     */
    List<Employee> getEmployeeList();

    /**
     * 根据id查询老师
     *
     * @param id
     * @return
     */
    Employee getEmployeeById(int id);

    /**
     * 添加一个新的教师
     *
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 根据id删除老师
     *
     * @param id
     * @return
     */
    int deleteEmployeeById(int id);

    /**
     * 修改老师信息
     *
     * @param employee
     * @return
     */
    int updateEmployeeById(Employee employee);

    /**
     * 根据id查询老师的信息和奖金
     *
     * @param id
     * @return
     */
    List<Employee> getEmployeeBonusById(int id);

    /**
     * 根据id查询老师的信息和罚金
     *
     * @param id
     * @return
     */
    Employee getEmployeeFineById(int id);
}
