package vercauteren.laurens.stockexchange.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "vercauteren.laurens.stockexchange")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
