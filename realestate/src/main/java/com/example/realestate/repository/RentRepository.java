package com.example.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.realestate.model.Rent;

@Repository
public interface RentRepository extends JpaRepository<Rent,Integer> {
     
}
