package com.example.common.thinkinjava;

/**
 * @author lingjun.jlj
 * @date: 2018/5/1
 * @Description:
 */
public class MainTest extends AbstractTest {

    @Override
    public void test() {
        System.out.println("Hell abstract");
    }

    public static void main(String[] args) {
        System.out.println(1 >> 2);
        System.out.println(1 << 2);
    }
}
