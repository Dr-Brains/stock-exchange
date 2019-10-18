package vercauteren.laurens.stockexchange.api;

import vercauteren.laurens.stockexchange.domain.Stock;
import vercauteren.laurens.stockexchange.domain.StockPrice;

public class StockDto {

	public final String id;
	public final String name;
	public String  price;

	public StockDto(Stock stock) {
		this.id = stock.getId();
		this.name = stock.getName();
		this.price = stock.getPrice().toString();
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