package com.tistory.tech.gyutech.service

import com.tistory.tech.gyutech.organization.Fund
import com.tistory.tech.gyutech.organization.Team
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class FundUpdateService(
    private val messengerService: SendMessengerService
) {
    private val log = LoggerFactory.getLogger(this::class.java)

    fun updateFund() {
        log.info("펀드 변경 시작~")

        val fund = getFundById()
        fund.changeTeam(Team("A02", "IB2팀"))
        messengerService.sendAlarm(fund)

        log.info("펀드 변경 완료!")
    }

    private fun getFundById(): Fund {
        return Fund("F01", "IB1팀-운용", Team("A01", "IB1팀"))
    }
}