package com.kancho.scheduler.horoscope.controller

import com.kancho.scheduler.horoscope.service.HoroscopeService
import org.springframework.stereotype.Component

@Component
class HoroscopeController(val horoscopeService: HoroscopeService) {

    fun horoscopeCrawling() = horoscopeService.crawling()

}