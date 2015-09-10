package io.github.terramedia.eureka.service.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by arsouza on 10/09/15.
 */

@FeignClient("producer-service")
interface ProducerRepository {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	String getMyAwesomeness();

}
