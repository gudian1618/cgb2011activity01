package com.github.gudian1618.cgb2011activity01.service;

import com.github.gudian1618.cgb2011activity01.dao.ActivityDao;
import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:32 下午
 */

@Service
public class ActivityServiceImpl implements ActivityService {

    /**
     * JDBC 门面模式
     */
    private Logger log = LoggerFactory.getLogger(ActivityServiceImpl.class);

    @Autowired
    private ActivityDao activityDao;

    @Override
    public List<Activity> findActivitys() {
        log.info("start {}", System.currentTimeMillis());
        List<Activity> list = activityDao.findActivitys();
        log.info("end {}", System.currentTimeMillis());

        return null;
    }
}
