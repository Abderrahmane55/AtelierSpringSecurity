package com.xproce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.xproce.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan(basePackages = "com.xproce")


@Component

public class BankBackendApplication {




	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

}
