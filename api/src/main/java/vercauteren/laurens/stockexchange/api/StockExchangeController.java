package vercauteren.laurens.stockexchange.api;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vercauteren.laurens.stockexchange.service.StockService;

//import java.util.logging.Logger;

@RestController
@ResponseBody
@RequestMapping("/stocks")
public class StockExchangeController {

	Logger logger = LoggerFactory.getLogger(StockExchangeController.class);

	@GetMapping("/{stockId}")
	public StockDto getStock(@PathVariable String stockId) {
		try {
			logger.info("getting stock from stockId");
			return new StockDto(StockService.getStock(stockId));
		} catch (IllegalArgumentException e) {
			System.err.println("Stock does not exist." + e.getMessage());
		}
		return null;
	}

}
