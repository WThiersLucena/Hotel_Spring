package com.hotel.Hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.Hotel.entities.Hotels;



//public interface HotelsRepository extends  JpaRepository<Hotels, Long>{
//
//}

@Repository
public interface HotelsRepository extends  JpaRepository<Hotels, Long>{
	
}