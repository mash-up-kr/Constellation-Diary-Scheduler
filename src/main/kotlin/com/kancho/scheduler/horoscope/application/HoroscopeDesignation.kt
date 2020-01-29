package com.kancho.scheduler.horoscope.application

import com.kancho.scheduler.horoscope.domain.constant.*
import com.kancho.scheduler.horoscope.domain.horoscope.Horoscope
import com.kancho.scheduler.util.calculateDate
import com.kancho.scheduler.util.randIndex
import org.springframework.stereotype.Component

@Component
class HoroscopeDesignation {
    fun designate(constellation: Constellation, content: String): Horoscope =
            Horoscope(constellation, calculateDate(), content,
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