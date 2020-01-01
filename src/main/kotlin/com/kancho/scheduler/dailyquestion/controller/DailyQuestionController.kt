package com.kancho.scheduler.dailyquestion.controller

import com.kancho.scheduler.dailyquestion.application.DailyQuestionService
import org.springframework.stereotype.Component

@Component
class DailyQuestionController(private val dailyQuestionService: DailyQuestionService) {
    fun designateDailyQuestion() = dailyQuestionService.designateDailyQuestion()
}