package org.sampath.bank.sampathbank.repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jude on 6/24/2017.
 */
public class AccountRepository {

	private static Map<Long, Double> accounts = new HashMap<>();
	private static Map<Long, Integer> accountCredentials = new HashMap<>();

	static{
		accounts.put(1234567891011121L, 1000.0);
		accounts.put(1111111111111111L, 1000.0);
		accounts.put(2222222222222222L, 1000.0);

		accountCredentials.put(1234567891011121L, 123);
		accountCredentials.put(1111111111111111L, 111);
		accountCredentials.put(2222222222222222L, 222);
	}

	public static void deposite(Long accountNumber, Double amount){
		accounts.put(accountNumber, amount);
	}

	public static Double charge(Long accountNumber, Integer cvc, Double amount) {
		if (accountCredentials.get(accountNumber).equals(cvc)) {
			accounts.computeIfPresent(accountNumber, (aLong, aDouble) -> aDouble - amount);
			return accounts.get(accountNumber);
		}
		return new Double(0);
	}



}
