package com.er.controller;

import com.er.model.Skill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/skill")
public class SkillController extends AbstractController<Skill> {
}