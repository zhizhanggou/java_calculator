package com.calculator;

import java.applet.Applet;


class Person{
	public void eat(Apple apple) {
		Apple peeled=apple.getPeeled();
		System.out.println("Yummy");
	}
}
class peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}
class Apple{
	Apple getPeeled() {return peeler.peel(this);}
}
public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}
