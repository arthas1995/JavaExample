package com.example.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/28 10:24
 * @version：1.0
 * @description: 断言
 */
public class AssertTest {

    public static void main(String[] args) {
        int x = -1;
        assert x >= 0;
        assert x >= 0 : x;
        System.out.println("输出日志");
    }
}
