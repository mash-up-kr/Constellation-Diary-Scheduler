package com.kancho.scheduler.horoscope.service

interface HoroscopeCrawling {

    fun crawling(url: String): String

}