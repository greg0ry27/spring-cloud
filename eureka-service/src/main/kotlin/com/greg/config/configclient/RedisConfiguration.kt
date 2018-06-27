package com.greg.config.configclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.core.StringRedisTemplate
import java.time.Duration

class RedisConfiguration {

//    private val log = LoggerFactory.getLogger(RedisConfiguration::class.java)

//    @Value("\${redis.host}")
//    lateinit var host: String
//    @Value("\${redis.port}")
//    lateinit var port: String
//
//    @Value("\${redis.connection.timeout}")
//    lateinit var connectionTimeout: String
//    @Value("\${redis.read.timeout}")
//    lateinit var readTimeout: String

//    @Bean
//    fun factoryConfiguration() = RedisStandaloneConfiguration(host, port.toInt())
//
//    @Bean
//    fun jedisConfiguration() = JedisClientConfiguration.builder()
//            .connectTimeout(Duration.ofMillis(connectionTimeout.toLong()))
//            .readTimeout(Duration.ofMillis(readTimeout.toLong()))
//            .build()
//
//    @Bean
//    fun connectionFactory(
//            clientConfiguration: JedisClientConfiguration,
//            standaloneConfiguration: RedisStandaloneConfiguration
//    ) = JedisConnectionFactory(standaloneConfiguration, clientConfiguration)
//
//    @Bean
//    fun stringTemplate(connectionFactory: RedisConnectionFactory) = StringRedisTemplate(connectionFactory)

}