package com.tistory.tech.gyutech.event

import com.tistory.tech.gyutech.service.SendMessengerService
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionPhase
import org.springframework.transaction.event.TransactionalEventListener

@Component
class UpdateEventListener(
    private val sendMessengerService: SendMessengerService
) {

    @TransactionalEventListener
    fun listenEvent(updateEvent: UpdateEvent) {
        sendMessengerService.sendAlarm(updateEvent.target)
    }

    @TransactionalEventListener()
    @Async("customAsyncExecutor")
    fun listenEventWithAsync(updateEvent: AsyncUpdateEvent) {
        sendMessengerService.sendAlarm(updateEvent.target)
    }
}