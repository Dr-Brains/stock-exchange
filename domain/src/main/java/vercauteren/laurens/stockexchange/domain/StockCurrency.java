package vercauteren.laurens.stockexchange.domain;

public enum StockCurrency {

	EUR("Euro", "€"),
	USD("United States Dollar", "$"),
	GBP("Pound sterling", "£");

	private String label, symbol;

	StockCurrency(String label, String symbol) {
		this.label = label;
		this.symbol = symbol;
	}

	public String getLabel() {
		return label;
	}

	public String getSymbol() {
		return symbol;
	}
}
