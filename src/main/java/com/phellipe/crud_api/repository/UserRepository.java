package com.phellipe.crud_api.repository;

import com.phellipe.crud_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
