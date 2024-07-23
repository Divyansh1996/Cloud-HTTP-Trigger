package com.httpcloudfunction.httpcloudfunction;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.BufferedWriter;


public class HttpcloudfunctionApplication implements HttpFunction {

	@Override
	public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
		BufferedWriter writer = httpResponse.getWriter();
		writer.write("Logs from the Spring boot Application");
	}
}
