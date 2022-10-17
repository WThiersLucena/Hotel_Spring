package com.hotel.Hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.Hotel.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
