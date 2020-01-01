package com.kancho.scheduler.dailyquestion.domain.dailyquestion

import org.springframework.data.jpa.repository.JpaRepository

interface DailyQuestionRepository : JpaRepository<DailyQuestion, Long>