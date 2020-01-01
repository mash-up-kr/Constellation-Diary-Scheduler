package com.kancho.scheduler.horoscope.infrastructure

import com.kancho.scheduler.horoscope.application.HoroscopeCrawling
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.springframework.stereotype.Component

@Component
class JsoupHoroscopeCrawling() : HoroscopeCrawling {

    override fun crawling(url: String): String {
        val doc: Document =
                Jsoup.connect(url).get()

        return doc.select("*#yearFortune > div > div.detail.detail2 > p:nth-child(4)").text()
    }

}