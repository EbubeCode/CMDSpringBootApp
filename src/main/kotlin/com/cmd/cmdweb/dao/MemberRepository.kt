package com.cmd.cmdweb.dao

import com.cmd.cmdweb.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member, Long> {
}
