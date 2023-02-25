package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class ChartController {

    @Autowired
    private Gson gson;

    @RequestMapping(value = "/chart/gchart_scatter", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView) {
        ArrayList datas = new ArrayList();
        // ['Age', 'Weight'],[8, 12],[4, 5.5],[11, 14],[4, 5],[3, 3.5],[6.5, 7];

        // Arrays.asList == ['Age','Weight'] 하드코딩으로 할 때 주로 사용함.
        datas.add(Arrays.asList("Age", "Weight"));
        datas.add(Arrays.asList(8, 12));
        datas.add(Arrays.asList(4, 5.5));
        datas.add(Arrays.asList(11, 14));
        datas.add(Arrays.asList(4, 5));
        datas.add(Arrays.asList(3, 3.5));
        datas.add(Arrays.asList(6.5, 7));

        modelAndView.addObject("dataArray", gson.toJsonTree(datas));
        modelAndView.setViewName("chart/gchart_scatter");
        return modelAndView;
    }
}
