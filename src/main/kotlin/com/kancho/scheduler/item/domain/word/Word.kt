package com.kancho.scheduler.item.domain.word

import javax.persistence.*

@Entity
@Table(name = "words")
class Word private constructor(id: Long? = null, content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    var content: String = content
        private set

    constructor(content: String) : this(null, content)
}