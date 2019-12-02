package com.example.demo.redis;

/**
 * 
 * Describe:
 */
public interface RedisService {

    /**
     * 判断key是否存在
     */
    Boolean hasKey(String key);

}
