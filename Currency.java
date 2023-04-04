package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.91);
				this.exchangeValues.put("GBP", 0.80);
				this.exchangeValues.put("CHF", 0.91);
				this.exchangeValues.put("CNY", 6.88);
				this.exchangeValues.put("JPY", 131.72);
				this.exchangeValues.put("INR", 0.012)
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.09);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.88);
				this.exchangeValues.put("CHF", 0.99);
				this.exchangeValues.put("CNY", 7.53);
				this.exchangeValues.put("JPY", 144.19);
				this.exchangeValues.put("INR", 89.91);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.25);
				this.exchangeValues.put("EUR", 1.14);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.13);
				this.exchangeValues.put("CNY", 8.60);
				this.exchangeValues.put("JPY", 164.56);
				this.exchangeValues.put("INR", 102.62);									
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 1.10);
				this.exchangeValues.put("EUR", 1.01);
				this.exchangeValues.put("GBP", 0.88);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 7.59);
				this.exchangeValues.put("JPY", 145.35);
				this.exchangeValues.put("INR", 90.64);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.15);
				this.exchangeValues.put("EUR", 0.13);
				this.exchangeValues.put("GBP", 0.12);
				this.exchangeValues.put("CHF", 0.13);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 19.14);
				this.exchangeValues.put("INR", 11.94);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.0076);
				this.exchangeValues.put("EUR", 0.0069);
				this.exchangeValues.put("GBP", 0.0061);
				this.exchangeValues.put("CHF", 0.0069);
				this.exchangeValues.put("CNY", 0.052);
				this.exchangeValues.put("JPY", 1.000);
				this.exchangeValues.put("RUPEE", 0.62);
				break;
			case "Indian Rupee":
				this.exchangeValues.put("USD", 0.012);
				this.exchangeValues.put("EUR", 0.011);
				this.exchangeValues.put("GBP", 102.62);
				this.exchangeValues.put("CHF", 0.0097);
				this.exchangeValues.put("CNY", 0.084);
				this.exchangeValues.put("JPY", 1.60);
				this.exchangeValues.put("INR", 1.00);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		currencies.add( new Currency("Indian Rupee",INR) );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}