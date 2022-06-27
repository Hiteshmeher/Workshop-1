package gamblingGame;

import java.util.Random;

public class Gambling {
	/**
	 * initialize stack is 100
	 * 
	 */
	static int EverydayStack = 100;
	static int BetStack = 1;

	public static void main(String[] args) {
		int StackIncrease = 150;
		int StackDecrease = 50;
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: " + EverydayStack);
		System.out.println("Bet Price: " + BetStack);

		while (EverydayStack > StackIncrease && EverydayStack < StackDecrease) {
			double random = Math.random();
			if (random < 0.5) {
				System.out.println("win the bet and stack is " + (EverydayStack+=BetStack));
			
			} else {
				System.out.println("Loss the bet and stack is " + (EverydayStack-=BetStack));
			}

		}

	}
}
