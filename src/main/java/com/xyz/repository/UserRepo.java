package com.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyz.entity.Userss;

public interface UserRepo extends JpaRepository<Userss, Integer> {

}
