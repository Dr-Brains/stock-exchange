package vercauteren.laurens.stockexchange.api;

import vercauteren.laurens.stockexchange.domain.Stock;
import vercauteren.laurens.stockexchange.domain.StockPrice;

public class StockDto {

	private final String id;
	private final String name;
	private StockPrice price;

	public StockDto(Stock stock) {
		this.id = stock.getId();
		this.name = stock.getName();
		this.price = stock.getPrice();
	}

	@Override
	public String toString() {
		return String.format("o-------o\n| Stock |\no-------o\n" +
						"ID: %s\n" +
						"Name: %s\n" +
						"Price: %s",
				id, name, price);
	}
}