package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.CreditServices.CardService;
import com.springrest.entity.CreditCard;

@RestController
public class Controller {

    @Autowired
    CardService cardService;

    @PostMapping(path = "/validate")
    public String checkCreditCard(@RequestBody CreditCard creditCard)
    {
        return cardService.cardValidation(creditCard);
    }
    @GetMapping(path = "/validateCard")
    public CreditCard checkCard()
    {
        CreditCard creditCard = new CreditCard("Visa" , "4567890123456789012");
        return cardService.cardValidation(creditCard).equalsIgnoreCase("Valid Credit Card") ? creditCard : creditCard;
    }

    
}