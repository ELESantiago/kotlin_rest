package com.inusualsoft.point_of_sale.users.models

import java.util.UUID
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name="users")
data class User (
        @Id
        @Column(columnDefinition = "uuid", updatable = false, nullable = false)
        @GeneratedValue(generator="UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: UUID = UUID.randomUUID(),

        @get: NotBlank
        val name: String = "",

        val secondName: String = "",

        @get: NotBlank
        val lastName: String = "",

        val secondLastName: String = "",

        @get: NotBlank
        val username: String = "",

        @get: NotBlank
        var password: String = "",

        @ManyToOne(targetEntity = UserType::class)
        @JoinColumn(name = "user_type_id", referencedColumnName = "id")
        val userType: UserType? = null,

        val active: Boolean = true
)