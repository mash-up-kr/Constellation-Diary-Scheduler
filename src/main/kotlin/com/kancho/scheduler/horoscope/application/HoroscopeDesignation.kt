package com.kancho.scheduler.horoscope.application

import com.kancho.scheduler.horoscope.domain.constant.Exercise
import com.kancho.scheduler.horoscope.domain.constant.Numeral
import com.kancho.scheduler.horoscope.domain.constant.Stylist
import com.kancho.scheduler.horoscope.domain.constant.Word
import com.kancho.scheduler.horoscope.domain.horoscope.Horoscope
import com.kancho.scheduler.until.calculateDate
import com.kancho.scheduler.until.randIndex
import org.springframework.stereotype.Component

@Component
class HoroscopeDesignation {
    fun designate(constellationId: Long, content: String): Horoscope =
            Horoscope(constellationId, calculateDate().toString(), content,
                    randStylist(), randNumber(), randWord(), randExercise())

    private fun randWord(): Word =
            Word.values()[randIndex(Word.values().size)]

    private fun randExercise(): Exercise =
            Exercise.values()[randIndex(Exercise.values().size)]

    private fun randStylist(): Stylist =
            Stylist.values()[randIndex(Stylist.values().size)]

    private fun randNumber(): Numeral =
            Numeral.values()[randIndex(Numeral.values().size)]

}