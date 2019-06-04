package com.er.repository;

import com.er.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sdrahnea
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}