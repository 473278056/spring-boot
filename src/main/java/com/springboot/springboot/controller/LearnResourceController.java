package com.springboot.springboot.controller;

import com.springboot.springboot.domain.LearnResouce;
import com.springboot.springboot.service.LearnResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 资源访问controller
 *
 * @author zhouchen
 * @date 2018-10-25
 */
@Controller
public class LearnResourceController {
    @Autowired
    private LearnResourceService learnResourceService;

    @RequestMapping("/learn")
    @ResponseBody
    public ModelAndView index(){
        List<LearnResouce> learnList = learnResourceService.getAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("learnList",learnList);
        return modelAndView;
    }
}