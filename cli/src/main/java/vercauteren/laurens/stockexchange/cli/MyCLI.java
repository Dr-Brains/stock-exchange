package vercauteren.laurens.stockexchange.cli;

import vercauteren.laurens.stockexchange.api.StockExchangeController;

public class MyCLI {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("GTFO");
		} else {
			System.out.println(StockExchangeController.getStock(args[0]));
		}
	}
}
