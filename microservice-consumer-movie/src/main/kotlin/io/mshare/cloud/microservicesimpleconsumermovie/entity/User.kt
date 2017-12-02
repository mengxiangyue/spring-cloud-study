package io.mshare.cloud.microservicesimpleprovideruser.entity


import java.math.BigDecimal
import javax.persistence.*

data class User(val id: Long = 0,
                val username: String = "",
                val name: String = "",
                val age: String ="",
                val balance: BigDecimal = BigDecimal.ZERO)