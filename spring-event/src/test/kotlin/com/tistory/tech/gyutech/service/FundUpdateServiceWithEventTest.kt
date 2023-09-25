package com.tistory.tech.gyutech.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FundUpdateServiceWithEventTest {

    @Autowired
    private lateinit var fundUpdateServiceWithEvent: FundUpdateServiceWithEvent

    @Test
    @DisplayName("이벤트 분리 테스트")
    fun `event isolation test`() {
        fundUpdateServiceWithEvent.updateFund()
    }

    @Test
    @DisplayName("이벤트 분리와 비동기")
    fun `async event isolation test`() {
        fundUpdateServiceWithEvent.asyncUpdateFund()
    }
}