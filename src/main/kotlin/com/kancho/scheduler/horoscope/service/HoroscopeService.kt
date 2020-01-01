package com.kancho.scheduler.horoscope.service

import com.kancho.scheduler.horoscope.domain.constellation.Constellation
import com.kancho.scheduler.horoscope.domain.constellation.ConstellationRepository
import org.springframework.stereotype.Service

@Service
class HoroscopeService(val horoscopeCrawling: HoroscopeCrawling,
                       val constellationRepository: ConstellationRepository) {
    fun crawling() {

        val constellations: List<Constellation> = constellationRepository.findAll()

        var result: String

        for (c in constellations) {
            result = horoscopeCrawling.crawling(c.crawlingUrl)
        }
    }

}