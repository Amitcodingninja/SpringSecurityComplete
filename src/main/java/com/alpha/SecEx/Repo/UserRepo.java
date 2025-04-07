package com.alpha.SecEx.Repo;

import com.alpha.SecEx.Entity.Student;
import com.alpha.SecEx.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}