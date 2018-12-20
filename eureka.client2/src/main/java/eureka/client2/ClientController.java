package eureka.client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@GetMapping(value = "/greeting")
	public String sayHello() {
		return "Hello Siyaram - Client2";
	}
}
