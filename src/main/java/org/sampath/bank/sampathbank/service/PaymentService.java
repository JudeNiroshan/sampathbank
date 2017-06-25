package org.sampath.bank.sampathbank.service;

/**
 * Created by Jude on 6/24/2017.
 */
public interface PaymentService {

	Boolean chargeAmount(Long ccNumber, String owner, Integer cvc, Double amount);

}
