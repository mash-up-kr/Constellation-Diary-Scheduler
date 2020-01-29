package com.kancho.scheduler.horoscope.domain.horoscope

import com.kancho.scheduler.common.LocalDatePersistenceConverter
import com.kancho.scheduler.horoscope.domain.constant.*
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "horoscopes")
class Horoscope private constructor(id: Long? = null, constellation: Constellation,
                                    date: LocalDate, content: String, stylist: Stylist,
                                    numeral: Numeral, word: Word, exercise: Exercise) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    @Enumerated(EnumType.STRING)
    var constellation: Constellation = constellation
        private set

    @Convert(converter = LocalDatePersistenceConverter::class)
    var date: LocalDate = date
        private set

    @Lob
    var content: String = content
        private set

    @Enumerated(EnumType.STRING)
    var stylist: Stylist = stylist
        private set

    @Enumerated(EnumType.STRING)
    @Column(name = "number")
    var numeral: Numeral = numeral
        private set

    @Enumerated(EnumType.STRING)
    var word: Word = word
        private set

    @Enumerated(EnumType.STRING)
    var exercise: Exercise = exercise
        private set

    constructor(constellation: Constellation, date: LocalDate, content: String,
                stylist: Stylist, numeral: Numeral, word: Word, exercise: Exercise) :
            this(null, constellation,
                    date, content, stylist, numeral, word, exercise)
}