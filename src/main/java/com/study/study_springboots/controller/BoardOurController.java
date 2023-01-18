package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

// * Cast 
// - use bootstrap
// - 항목 : title, content,userName, date
// - CRUD : 
//   + list.jsp(/board) -> view.jsp(/board_our/view) -> list.jsp(/board_our/list)
//   + list.jsp(/board) -> form.jsp(/board_our/form) -> list.jsp(/board_our/save) with Post
//   + view.jsp(/board_our/view) -> edit.jsp(/board_our/edit) -> list.jsp(/board_our/save)
@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {

    @Autowired // 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입.
    DataInfors dataInfors;

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("board_our/edit");
        return modelAndView;
    }

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("firstString", "firstValue");
        // DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);

        modelAndView.setViewName("board_our/list");

        return modelAndView; // --> Dispatcher Servlet
    }

    @RequestMapping(value = "/view/{action_uid}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String action_uid, ModelAndView modelAndView) {
        // public ModelAndView view(@RequestParam String uid, ModelAndView modelAndView)
        // {
        // System.out.println("uid :" + uid);
        // DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMemberBean();
        modelAndView.addObject("boardBean", boardBean);

        modelAndView.setViewName("board_our/view");
        return modelAndView;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board_our/form");
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    // public ModelAndView save(@RequestParam HashMap<String, String> params,
    // ModelAndView modelAndView) {
    public ModelAndView save(BoardBean boardBean, ModelAndView modelAndView) {
        // insert biz
        modelAndView.setViewName("board_our/list");
        return modelAndView;
    }
}
