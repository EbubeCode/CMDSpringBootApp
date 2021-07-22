package com.cmd.cmdweb.dao

import org.springframework.data.jpa.repository.JpaRepository
import com.cmd.cmdweb.entity.Record;

interface RecordRepository: JpaRepository<Record, Long> {
}