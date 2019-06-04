package com.er.controller;

import com.er.model.Dashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController extends AbstractController<Dashboard> {

}