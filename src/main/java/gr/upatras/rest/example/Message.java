package gr.upatras.rest.example;

public class Message {
	private String text;
	
	public Message(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void publish() {
		SimpleMqttClient client = new SimpleMqttClient();
		client.runClient(this);
	}
}