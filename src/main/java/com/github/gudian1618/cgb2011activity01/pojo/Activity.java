package com.github.gudian1618.cgb2011activity01.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:02 下午
 * 用于存储活动信息的pojo对象
 */

public class Activity implements Serializable {

    private static final long serialVersionUID = 8061797569821604641L;
    private Long id;
    private String title;
    private String category;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Short state;
    private String remark;
    private String createdUser;
    private LocalDateTime createdTime;

    @Override
    public String toString() {
        return "Activity{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", category='" + category + '\'' +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
            ", state=" + state +
            ", remark='" + remark + '\'' +
            ", createdUser='" + createdUser + '\'' +
            ", createdTime=" + createdTime +
            '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

}
