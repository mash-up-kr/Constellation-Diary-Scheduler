package com.kancho.scheduler.horoscope.application

interface HoroscopeCrawling {

    fun crawling(url: String): String

}