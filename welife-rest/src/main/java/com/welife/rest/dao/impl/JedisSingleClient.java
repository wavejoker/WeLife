package com.welife.rest.dao.impl;

import com.welife.rest.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author Creeper
 * @date 17-11-9 上午9:28
 * @since 1.8.0_151
 */

public class JedisSingleClient implements JedisClient {
    @Autowired
    private JedisPool jedisPool;

    @Override
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String get = jedis.get(key);
        jedis.close();
        return get;
    }

    @Override
    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String set = jedis.set(key, value);
        jedis.close();
        return set;
    }

    @Override
    public String hget(String key, String field) {
        Jedis jedis = jedisPool.getResource();
        String hget = jedis.hget(key, field);
        jedis.close();
        return hget;
    }

    @Override
    public Long hset(String key, String field, String value) {
        Jedis jedis = jedisPool.getResource();
        Long hset = jedis.hset(key, field, value);
        jedis.close();
        return hset;
    }

    @Override
    public Long incr(String key) {
        Jedis jedis = jedisPool.getResource();
        Long incr = jedis.incr(key);
        jedis.close();
        return incr;
    }

    @Override
    public Long expire(String key, Integer seconds) {
        Jedis jedis = jedisPool.getResource();
        Long expire = jedis.expire(key, seconds);
        jedis.close();
        return expire;
    }

    @Override
    public Long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        Long ttl = jedis.ttl(key);
        jedis.close();
        return ttl;
    }

    @Override
    public Long hdel(String key, String field) {
        Jedis jedis = jedisPool.getResource();
        Long hdel = jedis.hdel(key, field);
        jedis.close();
        return hdel;
    }

    @Override
    public Long del(String keys) {
        Jedis jedis = jedisPool.getResource();
        Long del = jedis.del(keys);
        jedis.close();
        return del;
    }
}
