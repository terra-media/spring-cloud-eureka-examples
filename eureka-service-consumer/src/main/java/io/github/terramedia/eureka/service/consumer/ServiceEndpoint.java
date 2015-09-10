package io.github.terramedia.eureka.service.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by arsouza on 09/09/15.
 */

@RestController
public class ServiceEndpoint {


	@Autowired
	ProducerRepository producerRepository;

	@HystrixCommand(fallbackMethod = "notSoAwesomeMessage")
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public String myAwesomeService() {

		final String stringPaquitona = producerRepository.getMyAwesomeness();
		return stringPaquitona;
	}

	public String notSoAwesomeMessage() {
		return "sad story";
	}


}
