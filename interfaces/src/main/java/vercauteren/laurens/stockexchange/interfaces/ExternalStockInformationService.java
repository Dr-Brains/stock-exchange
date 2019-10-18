package vercauteren.laurens.stockexchange.interfaces;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.Random;

public class ExternalStockInformationService {

	public static BigDecimal getPriceInEuroForStock(String stockId) {
		return generateRandomBigDecimalBetween10and100(new Random());
	}

	private static BigDecimal generateRandomBigDecimalBetween10and100(Random random) {
		return new BigDecimal(RandomUtils.nextDouble(10, 100));
	}

}
