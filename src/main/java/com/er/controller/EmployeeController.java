package com.er.controller;

import com.er.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController extends AbstractController<Employee> {
}