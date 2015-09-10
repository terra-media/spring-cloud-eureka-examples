package io.github.terramedia.eureka.service.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProducerApplication.class, args);
    }
}
