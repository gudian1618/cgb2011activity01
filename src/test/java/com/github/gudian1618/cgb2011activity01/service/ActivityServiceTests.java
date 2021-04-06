package com.github.gudian1618.cgb2011activity01.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:44 下午
 */

@SpringBootTest
public class ActivityServiceTests {

    @Autowired
    private ActivityService activityService;

    @Test
    public void testActivityService() {
        activityService.findActivitys();
    }

}
