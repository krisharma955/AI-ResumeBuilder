package com.SpringBoot.Resume_Builder.Repository;

import com.SpringBoot.Resume_Builder.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
