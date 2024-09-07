package com.adalbertosn.apirest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
//import org.springframework.data.redis.core.ReactiveValueOperations;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class RedisSpringApplicationTests {

//	@Autowired
//	private ReactiveStringRedisTemplate template;
//	@Test
//	void test() {
//		//fail("Not yet implemented");
//		ReactiveValueOperations<String, String> valueOperations = this.template.opsForValue();
//        long before = System.currentTimeMillis();
//        Mono<Void> mono = Flux.range(1, 500)
//                .flatMap(i-> valueOperations.increment("user:1:visit") ) //incr
//                .then();
//        StepVerifier.create(mono);
//        long after = System.currentTimeMillis();
//        System.out.println((after - before) + " ms");
//	}
	
	@Test
    public void firstT() {
        assertEquals("a","a");
    }

}
