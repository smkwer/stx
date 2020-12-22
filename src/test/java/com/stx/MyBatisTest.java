package com.stx;

import com.stx.domain.Employee;
import com.stx.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @Aythor :张国军
 * @Date ：Created in 20:35 2020/12/8
 * @Description : my_app
 **/
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatisTest {
//    @Autowired
//    private FineMapper fineMapper;
//
//    @Test
//    public void fun1(){
//        Fine fine=new Fine();
//        fine.setF_id(1);
//        fine.setFid(1);
//        fine.setAmount(1000);
//        fine.setFine(1000);
//        fineMapper.save(fine);
//    }
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void getEmployee(){
        List<Employee> employeeList = employeeMapper.getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void getEmployeeById(){
        Employee employeeById = employeeMapper.getEmployeeById(1);
        System.out.println(employeeById);
    }

    @Test
    public void addEmployee(){
        Employee employee = new Employee("1","1","1",5,"1","1","1","1","1");
        employeeMapper.addEmployee(employee);
    }

    @Test
    public void deleteEmployeeById(){
        employeeMapper.deleteEmployeeById(10);
    }

    @Test
    public void updateEmployeeById(){
        Employee employee = new Employee(9,"1","1","1",25,"1","1","1","1","1");
        employeeMapper.updateEmployeeById(employee);
    }

    @Test
    public void getEmployeeBonusById(){
        List<Employee> employeeBonusById = employeeMapper.getEmployeeBonusById(1);
        System.out.println(employeeBonusById);
    }

    @Test
    public void getEmployeeFine(){
        Employee employeeFineById = employeeMapper.getEmployeeFineById(1);
        System.out.println(employeeFineById);
    }
}
