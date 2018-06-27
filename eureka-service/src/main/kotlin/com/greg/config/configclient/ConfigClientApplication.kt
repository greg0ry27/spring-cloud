package com.greg.config.configclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import

@SpringBootApplication
@EnableEurekaServer
@Import(RedisConfiguration::class)
class ConfigClientApplication{

    @Bean
    fun mainController() = MainController()
}

fun main(args: Array<String>) {
    runApplication<ConfigClientApplication>(*args)
}
