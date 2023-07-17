package com.kashkinovopenshift.kashkinovopenshift.service

import com.kashkinovopenshift.kashkinovopenshift.dto.MessageRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class SendMessageService(
        private val restTemplate: RestTemplate,
        @Value("\${client.service.url}")
        private val url: String
) {
    fun sendMessage(messageRequest: MessageRequest): String {
        val response = restTemplate.postForEntity(url, messageRequest, String::class.java)

        return response.statusCode.toString()
    }

}