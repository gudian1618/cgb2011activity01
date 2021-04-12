package com.github.gudian1618.cgb2011activity01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/4/6 9:02 下午
 * 用于存储活动信息的pojo对象
 */

// @Setter
// @Getter
// @ToString

@Data
@NoArgsConstructor
@AllArgsConstructor
// 下面这个注解主要用于修饰final修饰的属性,即需要常量属性构造函数时,用该注解
// @RequiredArgsConstructor
public class Activity implements Serializable {

    private static final long serialVersionUID = 8061797569821604641L;
    private Long id;
    private String title;
    private String category;
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime startTime;
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private LocalDateTime endTime;
    private Short state=1;
    private String remark;
    private String createdUser;
    private LocalDateTime createdTime;

}
