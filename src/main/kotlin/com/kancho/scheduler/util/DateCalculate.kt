package com.kancho.scheduler.util

import java.time.LocalDate

const val ONE: Long = 1L

fun calculateDate(): LocalDate =
        LocalDate.now().plusDays(ONE)
