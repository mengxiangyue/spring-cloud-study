package io.mshare.cloud.microservicesimpleprovideruser.controller

import io.mshare.cloud.microservicesimpleprovideruser.entity.User
import io.mshare.cloud.microservicesimpleprovideruser.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
class UserController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): User {
        val findOne = userRepository.findOne(id)
        return findOne
    }
}