package com.kancho.scheduler.dailyquestion.application

import com.kancho.scheduler.dailyquestion.domain.dailyquestion.DailyQuestion
import com.kancho.scheduler.dailyquestion.domain.dailyquestion.DailyQuestionRepository
import com.kancho.scheduler.dailyquestion.domain.question.Question
import com.kancho.scheduler.dailyquestion.domain.question.QuestionRepository
import com.kancho.scheduler.util.calculateDate
import com.kancho.scheduler.util.randIndex
import org.springframework.stereotype.Service

@Service
class DailyQuestionService(private val questionRepository: QuestionRepository,
                           private val dailyQuestionRepository: DailyQuestionRepository) {


    fun designateDailyQuestion() {
        val questions: MutableList<Question> = questionRepository.findAll()

        val question: Question = randQuestion(questions)

        val dailyQuestion = DailyQuestion(calculateDate(), question.content)

        dailyQuestionRepository.save(dailyQuestion)
    }

    private fun randQuestion(questions: MutableList<Question>): Question =
            questions[randIndex(questions.size)]

}