package com.kashkinovopenshift.kashkinovopenshift.controller

import com.kashkinovopenshift.kashkinovopenshift.dto.MessageRequest
import com.kashkinovopenshift.kashkinovopenshift.service.SendMessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class SendMessageController(
        val sendMessageService: SendMessageService
) {

    @PostMapping("/api/v1/message")
    fun sendMessage(@RequestBody messageRequest: MessageRequest) =
            ResponseEntity.ok(sendMessageService.sendMessage(messageRequest))
}