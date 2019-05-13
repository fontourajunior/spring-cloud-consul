package br.com.consul.springconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConsulApplication.class, args);
	}

}
