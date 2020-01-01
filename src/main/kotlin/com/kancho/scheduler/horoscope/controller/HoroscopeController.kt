package com.kancho.scheduler.horoscope.controller

import com.kancho.scheduler.horoscope.application.HoroscopeService
import org.springframework.stereotype.Component

@Component
class HoroscopeController(private val horoscopeService: HoroscopeService) {

    fun horoscopeCrawling() = horoscopeService.designateHoroscope()

}