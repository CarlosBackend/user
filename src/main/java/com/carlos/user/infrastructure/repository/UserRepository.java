package com.carlos.user.infrastructure.repository;

import com.carlos.user.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Long>{
}
