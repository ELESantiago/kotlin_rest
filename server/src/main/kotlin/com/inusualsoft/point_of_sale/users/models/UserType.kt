package com.inusualsoft.point_of_sale.users.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserType (
    @Id
    val id: Int = 0,
    val name: String = "",
    val active: Boolean = true
)