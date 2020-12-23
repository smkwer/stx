package com.stx.mapper;


import com.stx.domain.Student;

import java.util.List;

/**
 * @author fsl
 */
public interface StudentMapper {
    int add(Student student);
    List<Student> getUserList();
    int update(Student student);
    int delete(String id);
}
