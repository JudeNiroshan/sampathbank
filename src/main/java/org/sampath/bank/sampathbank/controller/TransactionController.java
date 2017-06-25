package org.sampath.bank.sampathbank.controller;

import org.sampath.bank.sampathbank.model.Payment;
import org.sampath.bank.sampathbank.repository.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Jude on 6/24/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/payment")
public class TransactionController {

	//credit the given amount from the bank accounts
	@RequestMapping(value = "/chargeMoney", method = RequestMethod.POST)
	public ResponseEntity<Boolean> chargeAmount(@RequestBody Payment payRequest) {

		try{
			String accountNumStr = payRequest.getcCNumber();
			Integer cvc = payRequest.getCvcNumber();
			Double amount = payRequest.getAmount();
			AccountRepository.charge(Long.valueOf(accountNumStr), cvc, amount);
		}catch (Exception e){
			return new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

}
