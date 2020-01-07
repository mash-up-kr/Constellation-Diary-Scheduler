package com.kancho.scheduler.common

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class LocalDatePersistenceConverter : AttributeConverter<LocalDateTime, Date> {
    override fun convertToDatabaseColumn(entityValue: LocalDateTime): Date =
            Date.from(entityValue.atZone(ZoneId.systemDefault()).toInstant())

    override fun convertToEntityAttribute(databaseValue: Date): LocalDateTime =
            Instant.ofEpochMilli(databaseValue.time).atZone(ZoneId.systemDefault()).toLocalDateTime()

}