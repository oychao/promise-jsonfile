package controllers;

import models.ChatRoom;

import org.slf4j.Logger;

import play.mvc.*;

@SuppressWarnings("deprecation")
public class WebSocketController extends Controller {

	@SuppressWarnings("unused")
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	public Result index() {
		return ok(views.html.ws.render(""));
	}

	public LegacyWebSocket<String> ws() {
		return WebSocket.whenReady((in, out) -> {
			ChatRoom.start(in, out);
		});
	}

	public WebSocket wsNew() {
		return WebSocket.Text.accept(request -> {
			return null;
		});
	}
}
