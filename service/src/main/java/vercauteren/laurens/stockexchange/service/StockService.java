package vercauteren.laurens.stockexchange.service;

import vercauteren.laurens.stockexchange.domain.Stock;
import vercauteren.laurens.stockexchange.domain.StockCurrency;
import vercauteren.laurens.stockexchange.domain.StockPrice;
import vercauteren.laurens.stockexchange.domain.StockRepository;
import vercauteren.laurens.stockexchange.interfaces.ExternalStockInformationService;

public class StockService {

	public static Stock getStock(String stockId) {
		Stock stockToEnrich = StockRepository.getStockInformation(stockId);
		stockToEnrich.setPrice(
				new StockPrice(
						ExternalStockInformationService.getPriceInEuroForStock(stockId),
						StockCurrency.EUR));
		return stockToEnrich;
	}

}
