package com.cmd.cmdweb.entity

import java.util.*
import javax.persistence.*

@Entity
data class Member(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long,

    @Column(name = "first_name")
    var firstName: String,

    @Column(name = "middle_name")
    var middleName: String?,

    @Column(name = "last_name")
    var lastName: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "phone_number")
    var phoneNumber: String?,

    @Column(name = "image_url")
    var imageUrl: String?,

    @Column(name = "about")
    var about: String?,

    @Column(name = "dob")
    var dob: Date?,

    @Column(name = "portfolio")
    var portfolioUrl: String?,

    @Column(name = "facebook")
    var facebookUrl: String?,

    @Column(name = "linkedIn")
    var linkedInUrl: String?,

    @Column(name = "twitter")
    var twitterUrl: String?,

    @Column(name = "title")
    var title: String?,

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "member")
    var records: Set<Record>?
)
