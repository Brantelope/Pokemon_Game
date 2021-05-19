package main;

import java.util.Scanner;

import handler.TypeManager;
import objects.Players;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();

	}
	public static void run() {
		boolean running = true;
		Scanner scan = new Scanner(System.in);
		Players Player1 = new Players(150, 7, "BAleks", "Fire");
		Players Player2 = new Players(100, 10, "randon", "Water");
		String P1Name = Player1.getPName();
		String P2Name = Player2.getPName();
		String P1Type = Player1.getType();
		String P2Type = Player2.getType();
		// scan.next();
				
		while(running) {
			String Move = scan.next();
			// Player 1 does attack
			if(Move.equals("a")) {
				int P2health = (int) (Player2.getHealth() - Player1.getAttackDamage() * TypeManager.getMult(P1Type, P2Type));
				Player2.setHealth(P2health);	
				
				// checkHealth
				if(P2health<=0) {
					running = false;
				}
			}
			else if(Move.equals("h")) {
				int P1health = Player1.getHealth() + 5;
				Player1.setHealth(P1health);
			}
			else {
				System.out.println("Dumbo, lost your turn");
			}
			System.out.println(P1Name + ": " + Player1.getHealth());
			System.out.println(P2Name + ": " + Player2.getHealth());
			
			Move = scan.next();
			if(Move.equals("a")) {
				// Player 2 does attack
				int P1health = (int) (Player1.getHealth() - Player2.getAttackDamage() * TypeManager.getMult(P2Type, P1Type));
				Player1.setHealth(P1health);
				if(P1health<=0) { 
					running = false;
				}
			}
			else if(Move.equals("h")) {
				int P2health = Player2.getHealth() +5;
			}
			else {
				System.out.println("Dumbo, lost your turn");
			}
			System.out.println(P1Name + ": " + Player1.getHealth());
			System.out.println(P2Name + ": " + Player2.getHealth());
		}
	}
	
	
	//checkHealth - if player has health <=0; stop game
}
