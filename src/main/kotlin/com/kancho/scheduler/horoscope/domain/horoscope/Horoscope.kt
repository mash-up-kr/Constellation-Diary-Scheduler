package com.kancho.scheduler.horoscope.domain.horoscope

import com.kancho.scheduler.horoscope.domain.constant.Exercise
import com.kancho.scheduler.horoscope.domain.constant.Number
import com.kancho.scheduler.horoscope.domain.constant.Stylist
import com.kancho.scheduler.horoscope.domain.constant.Word
import javax.persistence.*

@Entity
@Table(name = "horoscopes")
class Horoscope private constructor(id: Long? = null, constellationsId: Int,
                                    date: String, content: String, stylist: Stylist,
                                    number: Number, word: Word, exercise: Exercise) {

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

    @Enumerated(EnumType.STRING)
    var stylist: Stylist = stylist
        private set

    @Enumerated(EnumType.ORDINAL)
    var number: Number = number
        private set

    @Enumerated(EnumType.STRING)
    var word: Word = word
        private set

    @Enumerated(EnumType.STRING)
    var exercise: Exercise = exercise
        private set

    constructor(constellationsId: Int, date: String, content: String,
                stylist: Stylist, number: Number, word: Word, exercise: Exercise) :
            this(null, constellationsId,
                    date, content, stylist, number, word, exercise)
}