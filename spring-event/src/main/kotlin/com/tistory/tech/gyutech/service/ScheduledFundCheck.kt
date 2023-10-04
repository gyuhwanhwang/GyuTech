package com.tistory.tech.gyutech.service

import net.javacrumbs.shedlock.core.LockAssert
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScheduledFundCheck(private val fundUpdateServiceWithEvent: FundUpdateServiceWithEvent) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Value("\${server.port}")
    lateinit var serverPort: String

    @Scheduled(fixedRate = 5000)
    @SchedulerLock(name = "scheduledTaskName", lockAtLeastFor = "4s")
    fun scheduledTask() {
        // To assert that the lock is held (prevents misconfiguration errors)
        LockAssert.assertLocked()
        fundUpdateServiceWithEvent.asyncUpdateFund()
        log.info("실행된 포트는 :$serverPort 입니다.")
    }

}