package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) {
		System.out.println("Hello");

		String name = "aassjbnbbnky";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap();

		//chat c = name.chatAt(0);
		for(int i = 0; i < name.length(); i ++) {
			if(map.containsKey(name.charAt(i))) {
				map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
			}
            else {
					map.put(name.charAt(i), 1);
				}

			}

			System.out.println(map.entrySet().stream().filter(obj -> obj.getValue() == 1).findFirst());


		//SpringApplication.run(DemoApplication.class, args);
	}


}
