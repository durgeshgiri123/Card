package com.example.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.card.model.CardsModel;
import com.example.card.model.Customer;
import com.example.card.repository.CardRepository;

@RestController
public class CardController {
	@Autowired
	private CardRepository cardRepository;
	@PostMapping ("/cards")
	public List<CardsModel> getCardDetails(@RequestBody Customer customer){
		List<CardsModel> card = cardRepository.findByCustomerId(customer.getcustomerId());
		return card;
	}

}
