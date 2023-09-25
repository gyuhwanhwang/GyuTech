package com.tistory.tech.gyutech.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class SendMessengerService {

    private val log = LoggerFactory.getLogger(this::class.java)

    fun sendAlarm(target: Any) {
        log.info("메신저 서버 호출 = {}", target)

        for (second in 1..3) {
            Thread.sleep(1000)
            log.info("{}초 기다림...", second)
            throw RuntimeException("메신저 서버 오류 발생!!!!!!!!!!!!!")
        }

        log.info("메신저 전송 완료 = {}", target)
    }
}