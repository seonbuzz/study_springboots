package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartController {
    @RequestMapping(value = "/chart/gchart_scatter", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("chart/gchart_scatter");
        return modelAndView;
    }
}
