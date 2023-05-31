package gr.upatras.rest.example;

import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {
	@Override
	public Message postMessage(String text) {
		Message message = new Message(text);
		return message;
	}
	
	@Override
	public void publishMessage(Message message) {
		message.publish();
	}
}