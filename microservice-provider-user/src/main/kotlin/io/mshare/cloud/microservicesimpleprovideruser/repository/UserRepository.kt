package io.mshare.cloud.microservicesimpleprovideruser.repository

import io.mshare.cloud.microservicesimpleprovideruser.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
}