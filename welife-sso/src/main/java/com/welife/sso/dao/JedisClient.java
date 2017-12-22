package com.welife.sso.dao;

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
