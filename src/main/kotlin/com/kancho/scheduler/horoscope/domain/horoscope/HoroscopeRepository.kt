package com.kancho.scheduler.horoscope.domain.horoscope

import org.springframework.data.jpa.repository.JpaRepository

interface HoroscopeRepository : JpaRepository<Horoscope, Long>