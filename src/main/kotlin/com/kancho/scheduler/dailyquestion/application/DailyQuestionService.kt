package com.kancho.scheduler.dailyquestion.application

import com.kancho.scheduler.dailyquestion.domain.dailyquestion.DailyQuestion
import com.kancho.scheduler.dailyquestion.domain.dailyquestion.DailyQuestionRepository
import com.kancho.scheduler.dailyquestion.domain.question.Question
import com.kancho.scheduler.dailyquestion.domain.question.QuestionRepository
import com.kancho.scheduler.horoscope.application.HoroscopeDesignation
import com.kancho.scheduler.horoscope.domain.constant.Numeral
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*
import javax.transaction.Transactional

@Service
class DailyQuestionService(private val questionRepository: QuestionRepository,
                           private val dailyQuestionRepository: DailyQuestionRepository) {

    companion object {
        private const val ONE_DAY: Long = 1L
        private const val START_INDEX: Int = 0
        private const val LOSE_LAST_SIZE: Int = 1
    }

    fun designateDailyQuestion() {
        val questions: MutableList<Question> = questionRepository.findAll()

        val question: Question = randQuestion(questions)

        val dailyQuestion = DailyQuestion(calculateDate().toString(), question.content)

        dailyQuestionRepository.save(dailyQuestion)

    }

    private fun randQuestion(questions: MutableList<Question>): Question =
            questions[randIndex(START_INDEX, questions.size - LOSE_LAST_SIZE)]

    private fun randIndex(from: Int, to: Int):
            Int = Random().nextInt(to - from) + from

    private fun calculateDate(): LocalDate =
            LocalDate.now().plusDays(ONE_DAY)

}