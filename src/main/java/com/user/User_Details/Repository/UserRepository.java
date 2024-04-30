package com.user.User_Details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.User_Details.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
