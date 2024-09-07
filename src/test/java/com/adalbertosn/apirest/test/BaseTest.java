package com.adalbertosn.apirest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.redisson.api.RedissonReactiveClient;

import com.adalbertosn.apirest.test.config.RedissonConfig;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BaseTest {
	private final RedissonConfig redissonConfig = new RedissonConfig();
    protected RedissonReactiveClient client;

    @BeforeAll
    public void serClient() {
        this.client = this.redissonConfig.getReactiveClient();
    }

    @AfterAll
    public void shutdown() {
        this.client.shutdown();
    }
    
//    @Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
