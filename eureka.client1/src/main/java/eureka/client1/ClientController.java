package eureka.client1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@GetMapping(value = "/greeting")
	public String sayHi() {
		return "Hi Siyaram - Client1";
	}
}
