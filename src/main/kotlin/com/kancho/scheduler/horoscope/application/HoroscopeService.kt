package com.kancho.scheduler.horoscope.application

import com.kancho.scheduler.horoscope.domain.constellation.Constellation
import com.kancho.scheduler.horoscope.domain.constellation.ConstellationRepository
import com.kancho.scheduler.horoscope.domain.horoscope.Horoscope
import com.kancho.scheduler.horoscope.domain.horoscope.HoroscopeRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class HoroscopeService(private val horoscopeCrawling: HoroscopeCrawling,
                       private val horoscopeDesignation: HoroscopeDesignation,
                       private val constellationRepository: ConstellationRepository,
                       private val horoscopeRepository: HoroscopeRepository) {
    @Transactional
    fun designateHoroscope() {
        val constellations: List<Constellation> = constellationRepository.findAll()

        val horoscopes: MutableList<Horoscope> = mutableListOf()

        for (c in constellations) {
            val content = horoscopeCrawling.crawling(c.crawlingUrl)
            val horoscope = horoscopeDesignation.designate(c.id!!, content)
            horoscopes.add(horoscope)
        }

        horoscopeRepository.saveAll(horoscopes)
    }
}