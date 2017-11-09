package com.welife.rest.dao;

/**
 * @author Creeper
 * @date 17-11-9 上午9:14
 * @since 1.8.0_151
 */
public interface JedisClient {
    String get(String key);

    String set(String key, String value);

    String hget(String key, String field);

    Long hset(String key, String field, String value);

    Long incr(String key);

    Long expire(String key, Integer seconds);

    Long ttl(String key);

    Long hdel(String key, String field);

    Long del(String keys);
}
