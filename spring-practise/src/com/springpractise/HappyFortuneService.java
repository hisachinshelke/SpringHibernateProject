package com.springpractise;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Your Day!!";
	}

}
