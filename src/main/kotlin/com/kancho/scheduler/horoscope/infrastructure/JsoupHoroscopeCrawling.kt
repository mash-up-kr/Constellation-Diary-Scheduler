package com.kancho.scheduler.horoscope.infrastructure

import com.kancho.scheduler.horoscope.service.HoroscopeCrawling
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class JsoupHoroscopeCrawling() : HoroscopeCrawling {

    override fun crawling(url: String): String {
        val doc: Document =
                Jsoup.connect("https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&query=%EB%AC%BC%EA%B3%A0%EA%B8%B0%EC%9E%90%EB%A6%AC%20%EC%9A%B4%EC%84%B8").get()

        return doc.select("*#yearFortune > div > div.detail.detail2 > p:nth-child(4)").text()
    }

}