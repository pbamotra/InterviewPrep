package com.pbamotra.ctci;

// Not a very good question to attempt
public class URLify {
	public String toURL(String url) {	
		return url.replaceAll("\\s+", "%20");
	}
}
