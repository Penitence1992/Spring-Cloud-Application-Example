package org.penitence.spring.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * class using
 * create by 2017/5/26
 *
 * @version 1.0.0
 * @auther Penitence
 */
@EnableRedisHttpSession
public class RedisSessionConfig {

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }
}
