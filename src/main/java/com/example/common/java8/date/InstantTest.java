package com.example.common.java8.date;

import java.time.Duration;
import java.time.Instant;

/**
 * @author lingjun.jlj
 * @date: 2018/5/14
 * @Description: Instant 代替 Date
 */
public class InstantTest {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        //将时间戳转换为Instant
        Instant time = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(time);

        //从字符串类型中创建Instant类型的时间
        instant = Instant.parse("1995-10-23T10:12:35Z");
        //将现在的时间加上5个小时4分钟
        instant.plus(Duration.ofHours(5).plusMinutes(4));

        System.out.println(instant);

    }
}
