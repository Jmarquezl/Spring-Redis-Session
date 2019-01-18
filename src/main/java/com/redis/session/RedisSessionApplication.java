package com.redis.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication
public class RedisSessionApplication {
//https://github.com/MicrosoftArchive/redis/releases
//https://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot-redis.html
	public static void main(String[] args) {
		SpringApplication.run(RedisSessionApplication.class, args);
	}

}

