package com.welife;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author Creeper
 * @date 17-11-9 下午3:33
 * @since 1.8.0_151
 */
public class JedisTest {

    @Test
    public void testJedis(){
        Jedis jedis = new Jedis("192.168.19.129", 6379);
        jedis.del("key1");
        jedis.close();

    }
}
