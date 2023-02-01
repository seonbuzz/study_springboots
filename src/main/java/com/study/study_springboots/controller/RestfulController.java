package com.study.study_springboots.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.study_springboots.service.CommonCodeOurService;

@RestController // 문자열 JSON 등 전송 가능
@CrossOrigin
public class RestfulController {
    @Autowired
    CommonCodeOurService commonCodeOurService;

    @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    // params - title : "learn ajax", description : "we learn with Ajax"
    @RequestMapping(value = "/api/v1/requestParam", method = RequestMethod.GET)
    public Map requestParam(@RequestParam Map<String, Object> params) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.putAll(params);
        result.put("id", "seonbuzz");
        return result;
    }

    // currentPage : 1
    @RequestMapping(value = "/api/v1/requestParamWithDB", method = RequestMethod.POST)
    public Map requestParamWithDB(@RequestParam Map<String, Object> params) {
        params.put("currentPage", Integer.parseInt((String) params.get("currentPage")));
        params.put("pageScale", 10);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap = (Map<String, Object>) commonCodeOurService.getListWithPagination(params);

        return resultMap;
    }
}
