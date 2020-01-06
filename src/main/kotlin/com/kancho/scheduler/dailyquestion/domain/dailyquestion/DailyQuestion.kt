package com.kancho.scheduler.dailyquestion.domain.dailyquestion

import com.kancho.scheduler.common.LocalDatePersistenceConverter
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "daily_questions")
class DailyQuestion private constructor(id: Long? = null, date: LocalDate, content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    @Convert(converter = LocalDatePersistenceConverter::class)
    var date: LocalDate = date
        private set

    var content: String = content
        private set

    constructor(date: LocalDate, content: String) : this(null, date, content)
}