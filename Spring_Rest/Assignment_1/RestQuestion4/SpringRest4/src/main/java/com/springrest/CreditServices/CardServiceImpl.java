package com.springrest.CreditServices;

import com.springrest.entity.CreditCard;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {
	private Long digits;
	private String cardDigit;

	public String cardValidation(CreditCard card) {

		if (card.getCardType().equalsIgnoreCase("American Express")
				|| card.getCardType().equalsIgnoreCase("Discover")) {
			if (card.getCardDigits().length() == 16) {
				cardDigit = card.getCardDigits().substring(0, 6);
				if (isNumeric(cardDigit)) {
					digits = Long.parseLong(cardDigit);

					if ((digits >= 601100 && digits <= 601109) || (digits >= 601120 && digits <= 601149)
							|| (digits == 601174) || (digits >= 601177 && digits <= 601179)
							|| (digits >= 601186 && digits <= 601199) || (digits >= 644000 && digits <= 650000))
						return "Valid Credit Card";
				} else
					return "Invalid Credit Card";
			} else
				return "Invalid Credit Card";
		}

		else if (card.getCardType().equalsIgnoreCase("enRoute")) {
			if (card.getCardDigits().length() == 15) {
				cardDigit = card.getCardDigits().substring(0, 4);
				if (cardDigit.equals("2014") || cardDigit.equals("2149"))
					return "Valid Credit Card";
			} else
				return "Invalid Credit Card";
		}

		else if (card.getCardType().equalsIgnoreCase("JCB")) {
			if (card.getCardDigits().length() >= 16 || card.getCardDigits().length() <= 19) {
				cardDigit = card.getCardDigits().substring(0, 4);
				if (isNumeric(cardDigit)) {
					digits = Long.parseLong(cardDigit);
					if (digits >= 3528 && digits <= 3589)
					return "Valid Credit Card";
				} else
					return "Invalid Credit Card";
			} else
				return "Invalid Credit Card";
		}

		else if (card.getCardType().equalsIgnoreCase("MasterCard")) {
			if (card.getCardDigits().length() == 16) {
				cardDigit = card.getCardDigits().substring(0, 6);
				if (isNumeric(cardDigit)) {
					int secondDigit = Character.getNumericValue(cardDigit.charAt(1));
					if (cardDigit.charAt(0) == '5' && (1 <= secondDigit && secondDigit <= 5)) {
						digits = Long.parseLong(cardDigit);
						if (digits >= 510000 && digits <= 559999)
							return "Valid Credit Card";
					} else if (cardDigit.charAt(0) == '2' && (2 <= secondDigit && secondDigit <= 7)) {
						digits = Long.parseLong(cardDigit);
						if (digits >= 222100 && digits <= 272099)
							return "Valid Credit Card";
					} else
						return "Invalid Credit Card";
				} else
					return "Invalid Credit Card";
			} else
				return "Invalid Credit Card";
		} 
		
		else if (card.getCardType().equalsIgnoreCase("Visa")) {
			if (card.getCardDigits().length() == 19) {
				if (isNumeric(cardDigit)) {
					if (cardDigit.charAt(0) == '4') 
						return "Valid Credit Card";
				} else
					return "Invalid Credit Card";
			} else
				return "Invalid Credit Card";
		} 
		
		else
			return "Invalid Credit Card";

		return "Invalid Credit Card";
	}

	// check that every card number is a digit

	private boolean isNumeric(String cardDigit) {
		if (cardDigit == null) {
			return false;
		}
		try {
			Double.parseDouble(cardDigit);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
