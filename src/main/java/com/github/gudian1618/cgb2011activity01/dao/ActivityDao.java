package com.github.gudian1618.cgb2011activity01.dao;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:14 下午
 */

@Mapper
public interface ActivityDao {

    @Insert("insert into tb_activity (title,category,startTime,endTime,state,remark,createUser,createdTime) values " +
        "(#{title},#{category},#{startTime},#{endTime},#{state},#{remark},#{createUser},#{createdTime})")
    int insertActivity(Activity activity);

    @Select("select * from tb_activity")
    List<Activity> findActivitys();

}
