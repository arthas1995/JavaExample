package com.example.test;

/**
 * @author: lingjun.jlj
 * @date: 2018/8/4 22:59
 * @description:
 */
public class ConcurrencyTest {

    private static final long count = 10000L;

    public static void main(String[] args) throws InterruptedException {
        Concurrency();
        serial();

    }

    public static void Concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0L; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();

        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("Concurrency " + time + "ms,b=" + b);
    }

    public static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial " + time + "ms,a=" + a);
    }
}
