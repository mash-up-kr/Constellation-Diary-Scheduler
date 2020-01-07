package com.kancho.scheduler.common

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.util.*
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class LocalDatePersistenceConverter : AttributeConverter<LocalDate, Date> {
    override fun convertToDatabaseColumn(entityValue: LocalDate): Date =
            Date.from(entityValue.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())

    override fun convertToEntityAttribute(databaseValue: Date): LocalDate =
            Instant.ofEpochMilli(databaseValue.time).atZone(ZoneId.systemDefault()).toLocalDate()

}