package com.github.gudian1618.cgb2011activity01.controller;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import com.github.gudian1618.cgb2011activity01.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("activity_edit")
    public String doActivityEditUI(Model model) {
        model.addAttribute("act", new Activity());
        return "activity_edit";
    }

    @RequestMapping("doFindById")
    public String doFindById(Long id, Model model) {
        Activity act = activityService.findById(id);
        model.addAttribute("act", act);
        return "activity_edit";
    }

    @RequestMapping("doSaveActivity")
    public String doSaveActivity(Activity entity) {
        if (entity.getId() == null) {
            activityService.saveActivity(entity);
        } else {
            activityService.updateActivity(entity);
        }
        return "redirect:activity_list";
    }

    @RequestMapping("activity_list")
    public String doActivityUI(Model model) {
        List<Activity> list = activityService.findActivitys();
        model.addAttribute("list", list);
        return "activity_list";
    }

    @RequestMapping("doFindActivitys")
    // 告诉springmvc 将返回json格式的字符串
    @ResponseBody
    public List<Activity> doFindActivitys() {
        List<Activity> list = activityService.findActivitys();
        return list;
    }

}
