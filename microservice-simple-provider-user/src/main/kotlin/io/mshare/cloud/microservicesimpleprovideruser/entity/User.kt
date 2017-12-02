package io.mshare.cloud.microservicesimpleprovideruser.entity


import java.math.BigDecimal
import javax.persistence.*

@Entity
data class User(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = 0,
                @Column val username: String = "",
                @Column val name: String = "",
                @Column val age: String ="",
                @Column val balance: BigDecimal = BigDecimal.ZERO)