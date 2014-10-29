package com.yobennett.spawn.examples;

import com.yobennett.spawn.server.Server;

public class ExampleServer {

	public static void main(String[] args) {
		new Server(8080, "/ws").startAndWait();
	}

}
