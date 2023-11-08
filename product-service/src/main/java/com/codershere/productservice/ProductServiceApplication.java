package com.codershere.productservice;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product();
		p1.setId("AZ244");
		p1.setName("Dondurma Makinası");
		p1.setDescription("Dondurma yapıyor.");
		p1.setPrice(BigDecimal.valueOf(3500));

		productRepository.save(p1);

		Product p2 = Product.builder()
				.id("AIR345")
				.name("AirFryer 4 lt.")
				.description("Philips Airfryer")
				.price(BigDecimal.valueOf(7000))
				.build();

		productRepository.save(p2);

		Product p3 = new Product("MK123", "Makarna 50 kg", "Makarna", BigDecimal.valueOf(500));

		productRepository.save(p3);

		Product p5 = new Product();
		p5.setId("XYZ12");
		p5.setName("Kitaplık");
		p5.setDescription("Tiamob dandik kitaplık");


		productRepository.save(p5);

	}
}
