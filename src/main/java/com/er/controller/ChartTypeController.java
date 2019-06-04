package com.er.controller;

import com.er.model.ChartType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/chart-type")
public class ChartTypeController extends AbstractController<ChartType> {
}