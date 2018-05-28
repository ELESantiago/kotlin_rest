package com.inusualsoft.point_of_sale.users.controller

import java.util.UUID
import com.inusualsoft.point_of_sale.users.models.User
import com.inusualsoft.point_of_sale.users.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
public class UserController(private val userRepository: UserRepository,
                            private val bCryptPasswordEncoder: BCryptPasswordEncoder) {

    // @GetMapping("/user")
    // fun getAllUsers(): List<User> = userRepository.findAll()

    // @PutMapping("/user/{id}")
    // fun updateCustomer(@PathVariable id: UUID, @RequestBody user: User) {
    //     assert(user.id == id)
    //     userRepository.save(user)
    // }

    @PostMapping("/user/sign-up")
    fun createNewUser(@Valid @RequestBody user: User): User {
        user.password = bCryptPasswordEncoder.encode(user.password)
        return userRepository.save(user)
    }

    // @PostMapping("/user/sign_up")
    // fun signUp(@RequestBody user: User): User = userRepository.save(user)


}