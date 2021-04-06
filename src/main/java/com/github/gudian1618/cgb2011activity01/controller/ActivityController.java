package com.github.gudian1618.cgb2011activity01.controller;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import com.github.gudian1618.cgb2011activity01.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 10:01 下午
 */

@Controller
@RequestMapping("/activity/")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping("doActivityUI")
    public String doActivityUI(Model model) {
        List<Activity> list = activityService.findActivitys();
        model.addAttribute("list", list);
        return "activity";
    }

}
