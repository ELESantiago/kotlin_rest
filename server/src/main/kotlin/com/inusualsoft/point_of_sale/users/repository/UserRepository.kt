package com.inusualsoft.point_of_sale.users.repository

import com.inusualsoft.point_of_sale.users.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun findByUsername(username: String): User
}