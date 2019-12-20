package com.kancho.scheduler.dailyquestion.domain.question

import org.springframework.data.jpa.repository.JpaRepository

interface QuestionRepository : JpaRepository<Question, Long>