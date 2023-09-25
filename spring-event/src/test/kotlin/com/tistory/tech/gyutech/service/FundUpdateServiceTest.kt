package com.tistory.tech.gyutech.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FundUpdateServiceTest {

    @Test
    @DisplayName("강결합 양상 테스트")
    fun `tightly coupled`() {
        val fundUpdateService = FundUpdateService(SendMessengerService())

        fundUpdateService.updateFund()
    }
}