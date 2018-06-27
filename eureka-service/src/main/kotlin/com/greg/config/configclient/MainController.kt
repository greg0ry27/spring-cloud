package com.greg.config.configclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @Value("\${service.name}")
    lateinit var name: String

    @RequestMapping("/name")
    fun add() = name


//    val key = "test-key-lis"
//
//    @Autowired
//    lateinit var redisTemplate: StringRedisTemplate;
//
//    @RequestMapping("/add")
//    fun add(): String {
//        val value = Random().nextInt().toString()
//        redisTemplate.opsForList().leftPush(key, value);
//        return "added: $value"
//    }
//
//    @RequestMapping("/list")
//    fun list(): String {
//        var size = redisTemplate.opsForList().size(key)
//        return redisTemplate.opsForList().range(key, 0, size!!).toString()
//    }

}