package gr.upatras.rest.example;

public interface IMessageService {
	Message postMessage(String text);
	void publishMessage(Message message);
}