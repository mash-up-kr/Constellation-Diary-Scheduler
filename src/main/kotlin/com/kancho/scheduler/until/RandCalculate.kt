package com.kancho.scheduler.until

import java.util.*


const val START_INDEX: Int = 0
const val LOSE_LAST_SIZE: Int = 1


fun randIndex(size: Int):
        Int = randIndex(START_INDEX, size - LOSE_LAST_SIZE)

fun randIndex(from: Int, to: Int):
        Int = Random().nextInt(to - from) + from