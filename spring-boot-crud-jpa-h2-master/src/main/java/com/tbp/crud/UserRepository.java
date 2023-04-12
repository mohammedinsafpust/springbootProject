package com.tbp.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbp.crud.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
