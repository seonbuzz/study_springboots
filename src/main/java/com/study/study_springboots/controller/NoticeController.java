package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/board_our") // board_our 폴더 쓸 예정
public class NoticeController {
    // list 표시 : /notice/
    // list의 특정 row를 클릭 -> edit로 이동
    // 클릭 시 넘겨지는 방식 : /notice/edit/{uid} ->pathVariable 사용

    // controller : HashMap hashmap = dataInfors.getDataByUid(uid))
    // edit (hashmap)

    // edit : save클릭하면 view로 이동
    // controller(@RequestParam HashMap<String, String> params) -@addObject(params)
    // 다음 view : object with params 표시

    // @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET){
    // public ModelAndView list(ModelAndView modelAndview){
    // modelAndview.addObject("", );
}
