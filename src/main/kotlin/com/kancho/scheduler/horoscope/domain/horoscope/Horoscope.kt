package com.kancho.scheduler.horoscope.domain.horoscope

import javax.persistence.*

@Entity
@Table(name = "horoscopes")
class Horoscope private constructor(id: Long? = null, constellationsId: Int,
                                    date: String, content: String, stylist: String,
                                    number: Int, word: String, exercise: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    var constellationsId: Int = constellationsId
        private set

    var date: String = date
        private set

    var content: String = content
        private set

    var stylist: String = stylist
        private set

    var number: Int = number
        private set

    var word: String = word
        private set

    var exercise: String = exercise
        private set

    constructor(constellationsId: Int, date: String, content: String,
                stylist: String, number: Int, word: String, exercise: String) :
            this(null, constellationsId,
                    date, content, stylist, number, word, exercise)
}