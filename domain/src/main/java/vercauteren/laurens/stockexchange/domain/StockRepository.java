package vercauteren.laurens.stockexchange.domain;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class StockRepository {

	private static Map<String, Stock> database =
			new ImmutableMap.Builder<String, Stock>()
					.put("AA", new Stock("AA", "Ambro AN"))
					.put("BB", new Stock("BB", "Baelung BA"))
					.put("CC", new Stock("CC", "CocaCola"))
					.put("DD", new Stock("DD", "Detroit DI"))
					.put("EE", new Stock("EE", "Erin EL"))
					.put("FF", new Stock("FF", "Freddy FV"))
					.put("GG", new Stock("GG", "Ginger GINC"))
					.build();

	public StockRepository() {
		this.database = new HashMap<>();
	}

	public static Stock getStockInformation(String stockID) {
		if (database.get(stockID) == null) throw new IllegalArgumentException("No stock with that id was found.");
		return database.get(stockID);
	}
}
