package io.mshare.cloud.microservicesimpleconsumermovie.controller

import io.mshare.cloud.microservicesimpleprovideruser.entity.User
import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.net.URI

@RestController
class MovieController {

    private val logger = Logger.getLogger(this::class.java)
    @Autowired
    private lateinit var restTemplate: RestTemplate

    @Value("\${user.userServiceUrl}")
    private lateinit var userServiceUrl: String

    @GetMapping("/user/{id}")
    fun findById(@PathVariable id: Long): User {
//        return restTemplate.getForObject("http://localhost:8000/{1}", User::class.java, id)
        logger.debug("user service url: ${userServiceUrl}")
        return restTemplate.getForObject("${userServiceUrl}/{1}", User::class.java, id)
    }

}