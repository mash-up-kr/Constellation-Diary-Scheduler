package com.kancho.scheduler.horoscope.domain.constant

import java.lang.RuntimeException
import java.util.*

enum class Constellation(private val value: String) {
    CAPRICORN("염소자리"),
    AQUARIUS("물병자리"),
    PISCES("물고기자리"),
    ARIES("양자리"),
    TAURUS("황소자리"),
    GEMINI("쌍둥이자리"),
    CANCER("게자리"),
    LEO("사자자리"),
    VIRGO("처녀자리"),
    LIBRA("천칭자리"),
    SCORPIO("전갈자리"),
    SAGITTARIUS("궁수자리");

    companion object {

        fun findByConstellation(value: String): Constellation? {
            return Arrays.stream(Constellation.values())
                    .filter { constellation: Constellation -> constellation.hasValue(value) }
                    .findAny()
                    .orElseThrow { RuntimeException() }
        }
    }

    private fun hasValue(value: String): Boolean {
        return this.value == value
    }
}