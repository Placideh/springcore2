package com.placideh.springcore2;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("the Bike it is running ");
	}
}
