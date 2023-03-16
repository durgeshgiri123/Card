package com.example.card.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.card.model.CardsModel;



public interface CardRepository extends  CrudRepository<CardsModel, Long>{
	
	List <CardsModel> findByCustomerId(int customerId);
}