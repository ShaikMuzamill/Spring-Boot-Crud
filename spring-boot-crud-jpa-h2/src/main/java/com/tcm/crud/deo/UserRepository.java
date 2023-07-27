package com.tcm.crud.deo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcm.crud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
