package com.github.gudian1618.cgb2011activity01.service;

import com.github.gudian1618.cgb2011activity01.dao.ActivityDao;
import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

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
    public Activity findById(Long id) {
        log.info("start {}", System.currentTimeMillis());
        Activity act = activityDao.findById(id);
        if (act==null) {
            throw new NoSuchElementException("对象可能已经不存在");
        }
        log.info("end {}", System.currentTimeMillis());
        return act;
    }

    @Override
    public void saveActivity(Activity entity) {
        log.info("start {}", System.currentTimeMillis());
        entity.setCreatedTime(LocalDateTime.now());
        activityDao.insertActivity(entity);
        log.info("end {}", System.currentTimeMillis());
    }

    @Override
    public List<Activity> findActivitys() {
        log.info("start {}", System.currentTimeMillis());
        List<Activity> list = activityDao.findActivitys();
        log.info("end {}", System.currentTimeMillis());

        return list;
    }
}
