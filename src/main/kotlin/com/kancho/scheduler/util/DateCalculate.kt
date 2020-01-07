package com.kancho.scheduler.util

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

const val ONE: Long = 1L
const val ZERO: Int = 0
const val FIFTEEN: Int = 15

fun calculateDate(): LocalDateTime =
        LocalDateTime.of(LocalDate.now().plusDays(ONE), LocalTime.of(FIFTEEN, ZERO))
