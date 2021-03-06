package com.example.utils.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author: lingjun.jlj
 * @date: 2018/8/13 14:45
 * @description:
 */
public class JedisUtils {

    private static JedisPool pool;

    public static Jedis getPool() {

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(2);
        config.setMinIdle(2);
        config.setTestOnBorrow(true);
        config.setMaxWaitMillis(10000);
        config.setMinIdle(5);

        pool = new JedisPool(config, "127.0.0.1", 6379, 10000);
        return pool.getResource();
    }

}
