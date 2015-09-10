package io.github.terramedia.eureka.service.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arsouza on 09/09/15.
 */
@RestController
public class ServiceEndpoint {

	@Autowired
	DiscoveryClient client;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public String myAwesomeService() {

		ServiceInstance localInstance = client.getLocalServiceInstance();
		return "my awesome service @"+ localInstance.getServiceId()+":"+localInstance.getHost()+":"+localInstance.getPort();
	}

}
