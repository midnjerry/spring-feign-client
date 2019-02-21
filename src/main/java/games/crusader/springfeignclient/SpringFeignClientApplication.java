package games.crusader.springfeignclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;



@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringFeignClientApplication {

	private Logger logger = LoggerFactory.getLogger(SpringFeignClientApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringFeignClientApplication.class, args);
	}

}
