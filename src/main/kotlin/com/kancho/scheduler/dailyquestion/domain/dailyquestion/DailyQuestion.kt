package com.kancho.scheduler.dailyquestion.domain.dailyquestion

import javax.persistence.*

@Entity
@Table(name = "daily_questions")
class DailyQuestion private constructor(id: Long? = null, date: String, content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    var date: String = date
        private set

    var content: String = content
        private set

    constructor(date: String, content: String) : this(null, date, content)
}