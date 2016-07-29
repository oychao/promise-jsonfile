package models;

import java.util.ArrayList;
import java.util.List;

import play.mvc.WebSocket;

@SuppressWarnings("deprecation")
public class ChatRoom {
	private static List<WebSocket.Out<String>> connections = new ArrayList<WebSocket.Out<String>>();

	public static void start(WebSocket.In<String> in, WebSocket.Out<String> out) {
		connections.add(out);

		in.onMessage((String s) -> {
			System.out.println(s);
			ChatRoom.notifyAll(s);
		});

		in.onClose(() -> {
			System.out.println("Disconnected");
			out.close();
		});
	}

	public static void notifyAll(String message) {
		for (WebSocket.Out<String> out : connections) {
			System.out.println("___NotifyAll:" + message);
			out.write("___NotifyAll:" + message);
		}
	}
}
