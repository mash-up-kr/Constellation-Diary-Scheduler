package com.kancho.scheduler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SchedulerApplication

fun main(args: Array<String>) {
	runApplication<SchedulerApplication>(*args)
}
