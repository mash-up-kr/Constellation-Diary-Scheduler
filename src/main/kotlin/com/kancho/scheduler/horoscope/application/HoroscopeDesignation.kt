package com.kancho.scheduler.horoscope.application

import com.kancho.scheduler.horoscope.domain.constant.Exercise
import com.kancho.scheduler.horoscope.domain.constant.Numeral
import com.kancho.scheduler.horoscope.domain.constant.Stylist
import com.kancho.scheduler.horoscope.domain.constant.Word
import com.kancho.scheduler.horoscope.domain.horoscope.Horoscope
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.util.*

@Component
class HoroscopeDesignation {
    fun designate(constellationId: Long, content: String): Horoscope =
            Horoscope(constellationId, calculateDate().toString(), content,
                    randStylist(), randNumber(), randWord(), randExercise())

    companion object {
        private const val ONE_DAY: Long = 1L
        private const val START_INDEX: Int = 0
        private const val LOSE_LAST_SIZE: Int = 1
    }

    private fun randWord(): Word =
            Word.values()[randIndex(START_INDEX, Word.values().size - LOSE_LAST_SIZE)]

    private fun randExercise(): Exercise =
            Exercise.values()[randIndex(START_INDEX, Exercise.values().size - LOSE_LAST_SIZE)]

    private fun randStylist(): Stylist =
            Stylist.values()[randIndex(START_INDEX, Stylist.values().size - LOSE_LAST_SIZE)]

    private fun randNumber(): Numeral =
            Numeral.values()[randIndex(START_INDEX, Numeral.values().size - LOSE_LAST_SIZE)]

    private fun randIndex(from: Int, to: Int):
            Int = Random().nextInt(to - from) + from

    private fun calculateDate(): LocalDate =
            LocalDate.now().plusDays(ONE_DAY)

}