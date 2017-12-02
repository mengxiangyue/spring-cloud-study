package io.mshare.cloud.microservicesimpleconsumermovie

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class MicroserviceSimpleConsumerMovieApplication {

    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(MicroserviceSimpleConsumerMovieApplication::class.java, *args)
}
