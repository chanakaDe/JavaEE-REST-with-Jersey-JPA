package com.chanakaSample.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.chanakaSample.model.Activity;

public class ActivityClient {

	private Client client;

	public ActivityClient() {
		client = ClientBuilder.newClient();
	}

	public Activity get(String id) {

		WebTarget target = client.target("http://localhost:8080/rest-services/webapi/");
		Activity response = target.path("activities/" + id).request()
				.get(Activity.class);
		return response;

	}

}
