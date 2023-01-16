package com.study.study_springboots.controller;

public class NoticeController {
    // list 표시 : /notice/
    // list의 특정 row를 클릭 -> edit로 이동
    // 클릭 시 넘겨지는 방식 : /notice/edit/{uid} ->pathVariable 사용

    // controller : HashMap hashmap = dataInfors.getDataByUid(uid))
    // edit (hashmap)

    // edit : save클릭하면 view로 이동
    // controller(@RequestParam HashMap<String, String> params) -@addObject(params)
    // 다음 view : object with params 표시
}
