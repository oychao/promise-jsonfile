function WebSocketTest() {
	var id = Math.floor(Math.random() * 100);
	console.log("id: " + id);

	if ("WebSocket" in window) {
		// Let us open a web socket
		var ws = new WebSocket("ws://localhost:9000/ws");

		ws.onopen = function() {
			// Web Socket is connected, send data using send()
			ws.send(id + " joined");
			console.log(id + "joined");
		};

		ws.onmessage = function(evt) {
			var received_msg = evt.data;
			console.log(received_msg);
		};

		ws.onclose = function() {
			// websocket is closed.
			console.log("closed.");
		};
	}

	else {
		// The browser doesn't support WebSocket
		alert("WebSocket NOT supported by your Browser!");
	}
}