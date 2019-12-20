package com.kancho.scheduler.item.domain.number

import javax.persistence.*

@Entity
@Table(name = "Numbers")
class Number private constructor(id: Long? = null, content: Int) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = id
        private set

    var content: Int = content
        private set

    constructor(content: Int) : this(null, content)
}