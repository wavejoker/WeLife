package com.welife.sso.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.welife.sso.dao.JedisClient;

import redis.clients.jedis.JedisCluster;

public class JedisClusterClient implements JedisClient {

	@Autowired
	private JedisCluster jedisCluster;

	@Override
	public String get(String key) {
		return jedisCluster.get(key);
	}

	@Override
	public String set(String key, String value) {
		return jedisCluster.set(key, value);
	}

	@Override
	public String hget(String key, String field) {
		return jedisCluster.hget(key, field);
	}

	@Override
	public Long hset(String key, String field, String value) {
		return jedisCluster.hset(key, field, value);
	}

	@Override
	public Long incr(String key) {
		return jedisCluster.incr(key);
	}

	@Override
	public Long expire(String key, Integer seconds) {
		return jedisCluster.expire(key, seconds);
	}

	@Override
	public Long ttl(String key) {
		return jedisCluster.ttl(key);
	}

	@Override
	public Long del(String keys) {
		return jedisCluster.del(keys);
	}

	@Override
	public Long hdel(String key, String field) {
		return jedisCluster.hdel(key, field);
	}

}
