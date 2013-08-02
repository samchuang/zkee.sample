package zkee.sample.spring;

import org.springframework.stereotype.Service;

@Service
public class Message {

	public String getHelloMessage() {
		return "Hello, ZK Spring";
	}
}
