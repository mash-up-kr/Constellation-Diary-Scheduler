package com.kancho.scheduler.util

import java.time.LocalDate

const val ONE_DAY: Long = 1L

fun calculateDate(): LocalDate =
        LocalDate.now().plusDays(ONE_DAY)
