package com.cmd.cmdweb.entity

import java.util.*
import javax.persistence.*;

@Entity
@Table(name = "record")
data class Record(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long,

    @Column(name = "date")
    var dateOfCreate: Date,

    @Column(name = "detail")
    var details: String?,

    @Column(name = "amount")
    var amount: Int?,

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private var member: Member?
)
