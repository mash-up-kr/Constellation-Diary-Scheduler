package com.kancho.scheduler.horoscope.application

import com.kancho.scheduler.horoscope.domain.constellation_crawling.Constellation
import com.kancho.scheduler.horoscope.domain.horoscope.Horoscope
import org.assertj.core.api.Assertions
import org.junit.Before
import org.junit.Test

class HoroscopeDesignationTest {

    lateinit var horoscopeDesignation: HoroscopeDesignation


    @Before
    fun set_up() {
        horoscopeDesignation = HoroscopeDesignation()
    }

    @Test
    fun 크롤링_데이터를_이용하여_운세_생성() {
        val constellation: Constellation = createConstellation()
        val constellationId: Long = 1L
        val horoscope: Horoscope =
                horoscopeDesignation.designate(constellationId, constellation.crawlingUrl)

        Assertions.assertThat(horoscope.constellationsId).isEqualTo(constellationId)
    }

    private fun createConstellation(): Constellation
            = Constellation("물병자리","02 ~ 04","설명", "http://google.com")
}