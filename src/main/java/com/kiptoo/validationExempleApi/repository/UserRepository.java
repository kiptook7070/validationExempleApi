package com.kiptoo.validationExempleApi.repository;

import com.kiptoo.validationExempleApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserId(int id);
}
