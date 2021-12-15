package com.javalogical.program;

public class Runnable1 {
	public static void main(String[] args) {
		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);

		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();

	}

}