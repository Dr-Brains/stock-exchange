package vercauteren.laurens.stockexchange.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ExternalStockInformationServiceTest {

	@Test
	void whenGeneratingRandomBigDecimal_thenGeneratedValueIsBetween10and100() {
		double doubleValue = (ExternalStockInformationService.getPriceInEuroForStock("AA")).doubleValue();
		Assertions.assertTrue(doubleValue >= 10 && doubleValue <= 100);
	}
}