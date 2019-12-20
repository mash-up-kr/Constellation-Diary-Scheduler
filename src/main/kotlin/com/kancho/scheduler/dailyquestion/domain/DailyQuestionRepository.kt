package com.kancho.scheduler.dailyquestion.domain

import org.springframework.data.jpa.repository.JpaRepository

interface DailyQuestionRepository: JpaRepository<DailyQuestion, Long>