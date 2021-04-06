package com.github.gudian1618.cgb2011activity01.dao;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:19 下午
 */

@SpringBootTest
public class ActivityDaoTests {

    @Autowired
    private ActivityDao activityDao;

    @Test
    public void testFindActivitys() {
        List<Activity> list = activityDao.findActivitys();
        for (Activity a : list) {
            System.out.println(a);
        }
    }

}
