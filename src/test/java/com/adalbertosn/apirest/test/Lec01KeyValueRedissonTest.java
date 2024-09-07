package com.adalbertosn.apirest.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.Test;
import org.redisson.api.RBucketReactive;
import org.redisson.api.RedissonReactiveClient;
import org.redisson.client.codec.StringCodec;

import com.adalbertosn.apirest.test.config.RedissonConfig;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class Lec01KeyValueRedissonTest extends BaseTest {

    //@Autowired
    //private ReactiveStringRedisTemplate template;
    @Test
    public void firstT() {
        assertEquals("a","a");
    }

    @Test
    public void keyValueAccessTest() {
        //assertNotNull("a");
        RBucketReactive<String> bucket = this.client.getBucket("user:1:name", StringCodec.INSTANCE);
        Mono<Void> set = bucket.set("sam");
        Mono<Void> get = bucket.get()
               .doOnNext(System.out::println)
               .then();
        StepVerifier.create(set.concatWith(get))
                .verifyComplete();

     }

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
}
