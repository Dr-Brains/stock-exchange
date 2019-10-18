package vercauteren.laurens.stockexchange.api;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vercauteren.laurens.stockexchange.service.StockService;

@Component
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

	@GetMapping("/{stockId}")
	public static StockDto getStock(@PathVariable String stockId) {
		try {
			StockService.getStock(stockId);
		} catch (IllegalArgumentException e) {
			System.err.println("Stock does not exist." + e.getMessage());
		}
		return new StockDto(StockService.getStock(stockId));
	}

}
