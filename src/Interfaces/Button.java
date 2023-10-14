package Interfaces;

public class Button {
	EventHandler handler;
	public Button(EventHandler action) {
		this.handler = action;
	}
	
	public void click() {
		handler.execute();
	}
}
