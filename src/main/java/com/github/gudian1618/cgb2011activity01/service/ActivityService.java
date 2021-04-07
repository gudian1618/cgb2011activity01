package com.github.gudian1618.cgb2011activity01.service;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:30 下午
 */

public interface ActivityService {

    void saveActivity(Activity entity);

    List<Activity> findActivitys();

}
