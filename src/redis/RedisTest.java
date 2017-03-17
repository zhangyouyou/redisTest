package redis;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class RedisTest {
	private static JedisPool pool;
	private static Jedis jedis;
	
	public static void main(String[] args) {
		pool =new JedisPool(new JedisPoolConfig(), "172.30.29.237");
		jedis = pool.getResource();
		jedis.set("dfdsf","1232");
		System.out.println(jedis.get("dfdsf"));
	}
}
