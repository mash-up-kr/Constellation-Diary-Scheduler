package com.kancho.scheduler.horoscope.domain.horoscope

import com.kancho.scheduler.common.LocalDatePersistenceConverter
import com.kancho.scheduler.horoscope.domain.constant.Exercise
import com.kancho.scheduler.horoscope.domain.constant.Numeral
import com.kancho.scheduler.horoscope.domain.constant.Stylist
import com.kancho.scheduler.horoscope.domain.constant.Word
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "horoscopes")
class Horoscope private constructor(id: Long? = null, constellationsId: Long,
                                    date: LocalDateTime, content: String, stylist: Stylist,
                                    numeral: Numeral, word: Word, exercise: Exercise) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    var constellationsId: Long = constellationsId
        private set

    @Convert(converter = LocalDatePersistenceConverter::class)
    var date: LocalDateTime = date
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

    constructor(constellationsId: Long, date: LocalDateTime, content: String,
                stylist: Stylist, numeral: Numeral, word: Word, exercise: Exercise) :
            this(null, constellationsId,
                    date, content, stylist, numeral, word, exercise)
}