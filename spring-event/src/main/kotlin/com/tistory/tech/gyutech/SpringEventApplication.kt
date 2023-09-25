package com.tistory.tech.gyutech

import com.tistory.tech.gyutech.service.FundUpdateServiceWithEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringEventApplication {

//    @Autowired
//    private lateinit var fundUpdateServiceWithEvent: FundUpdateServiceWithEvent

//    @Bean
//    fun init(): CommandLineRunner {
//        return CommandLineRunner {
//            for (i in 1..100) {
//                fundUpdateServiceWithEvent.asyncUpdateFund()
//            }
//        }
//    }
}

fun main(args: Array<String>) {

    runApplication<SpringEventApplication>()
}