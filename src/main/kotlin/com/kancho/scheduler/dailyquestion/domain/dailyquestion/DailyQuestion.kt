package com.kancho.scheduler.dailyquestion.domain.dailyquestion

import com.kancho.scheduler.common.LocalDatePersistenceConverter
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "daily_questions")
class DailyQuestion private constructor(id: Long? = null, date: LocalDateTime, content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    @Convert(converter = LocalDatePersistenceConverter::class)
    var date: LocalDateTime = date
        private set

    var content: String = content
        private set

    constructor(date: LocalDateTime, content: String) : this(null, date, content)
}