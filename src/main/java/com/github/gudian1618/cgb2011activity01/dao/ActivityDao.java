package com.github.gudian1618.cgb2011activity01.dao;

import com.github.gudian1618.cgb2011activity01.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:14 下午
 */

@Mapper
public interface ActivityDao {

    @Update("update tb_activity set title=#{title},category=#{category},startTime=#{startTime},endTime=#{endTime},remark=#{remark} where id=#{id}")
    int updateActivity(Activity entity);

    @Select("select * from tb_activity where id=#{id}")
    Activity findById(Long id);

    @Insert("insert into tb_activity (title,category,startTime,endTime,state,remark,createdUser,createdTime) values (#{title},#{category},#{startTime},#{endTime},#{state},#{remark},#{createdUser},#{createdTime})")
    int insertActivity(Activity activity);

    @Select("select * from tb_activity")
    List<Activity> findActivitys();

}
