package com.example;


import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Post_JSON {
	public static void main(String[] args) {
		Post_JSON.Post_JSON();
	}

	public static void Post_JSON() {
		String query_url = "https://gurujsonrpc.appspot.com/guru";
		String json = "{ \"method\" : \"guru.test\", \"params\" : [ \"Lamar \" ], \"id\" : 18 }";
		try {
			URL url = new URL(query_url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod("POST");
			// write the response
			OutputStream os = conn.getOutputStream();
			os.write(json.getBytes("UTF-8"));
			os.close();
			// read the response
			InputStream in = new BufferedInputStream(conn.getInputStream());
			String result = IOUtils.toString(in, "UTF-8");
			
			
			JSONObject myResponse = new JSONObject();
			
			System.out.println("jsonrpc- " + myResponse.getString("jsonrpc"));
			System.out.println("id- " + myResponse.getInt("id"));
			System.out.println("result- " + myResponse.getString("result"));
			in.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
