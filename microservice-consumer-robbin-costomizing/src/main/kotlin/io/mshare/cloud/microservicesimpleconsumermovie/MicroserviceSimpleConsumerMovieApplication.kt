package io.mshare.cloud.microservicesimpleconsumermovie

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
class MicroserviceSimpleConsumerMovieApplication {

    @Bean
    @LoadBalanced
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(MicroserviceSimpleConsumerMovieApplication::class.java, *args)
}
