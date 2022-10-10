package com.hotel.Hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.Hotel.entities.Hotels;



public interface HotelsRepository extends  JpaRepository<Hotels, Long>{

}

