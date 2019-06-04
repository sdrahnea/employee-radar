package com.er.controller;

import com.er.model.EmployeeSkill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/employee-skill")
public class EmployeeSkillController extends AbstractController<EmployeeSkill> {
}