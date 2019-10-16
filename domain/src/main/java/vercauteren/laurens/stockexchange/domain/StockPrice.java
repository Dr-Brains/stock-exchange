package vercauteren.laurens.stockexchange.domain;

import java.math.BigDecimal;

public class StockPrice {

	private final BigDecimal price;
	private final StockCurrency currency;

	public StockPrice(BigDecimal price, StockCurrency currency) {
		this.price = price;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return currency.getSymbol() + price;
	}
}
