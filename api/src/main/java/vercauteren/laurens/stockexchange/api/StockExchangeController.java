package vercauteren.laurens.stockexchange.api;

import vercauteren.laurens.stockexchange.service.StockService;

public class StockExchangeController {

	public static StockDto getStock(String stockId) {
		try {
			StockService.getStock(stockId);
		} catch (IllegalArgumentException e) {
			System.err.println("Stock does not exist." + e.getMessage());
		}
		return new StockDto(StockService.getStock(stockId));
	}

}
