package com.yobennett.spawn.examples;

import com.yobennett.spawn.client.Client;

public class ExampleClient {

	public static void main(String[] args) {
		new Client("127.0.0.1", 8080).startAndWait();
	}

}
