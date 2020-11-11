package com.placideh.springcore2;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{
	
	public void drive() {
		System.out.println("We are driving a car!");
	}
}
