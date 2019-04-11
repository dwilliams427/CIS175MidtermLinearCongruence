import java.util.Random;
import java.util.Scanner;
/*
 * Name: Daniel Williams & Matthew Ambrose
 * Date: 03/28/19 --> 04/11/19
 * 
 * 
 * 
 * @version 1.0
 * 
 * UML
 * +seed -- double
 * +multiplier -- double
 * +increment -- double
 * modulus -- double
 * 
 * SetSeed(double): void
 * RandGenerator(): double
 * 
 * 
 * class: Williams & Ambrose Midterm (file)
 * 	-- main {calls 
 * 
 * class random
 * 	-- public int generator(seed){ do equation }
 * 		get/set Seed()
 * 		get/set Inc()
 * 		get/set Mod()
 * 		get/set Mult()
 * 
 * 		
 * 
 * 
 * 
 * 
 */


public class RandomNumberGenerator {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	static LinearCongruence lc = new LinearCongruence();
	static char option = 'x';
	static int result = 0;
	static int seed =1;
	static int mult = 40;
	static int inc = 3641;
	static int mod = 729;

	public RandomNumberGenerator() {
		// TODO Auto-generated constructor stub
		
		 mult = rand.nextInt();
		 inc = rand.nextInt();
		 mod = rand.nextInt();
	}
	public RandomNumberGenerator(int s, int multi, int i, int m) {
		// TODO Auto-generated constructor stub
		seed = s;
		 mult = multi;
		 inc = i;
		 mod = m;
	}
	
	// GETTERS/SETTERS vvvvv //
	public static double GetSeed() {return seed;}								//GETTERS/SETTERS
	public static void SetSeed(int s) {seed = s;}
	public static double GetMult() {return mult;	}
	public static void SetMult(int multi) {	mult = multi;}
	public static double GetInc() {	return inc;	}
	public static void SetInc(int i) {inc = i;}
	public static double GetMod() {	return mod;	}
	public static void SetMod(int m) {	mod = m;}
	
	
	public static void RandGenerator() {										//do the calculations, generate random numbers, print out each result
		for (int i =0; i < mod; i++) {
			result = (mult * seed + inc) % mod;
			System.out.println("Result #" + i + ": " +  result);
			seed = result;
		}
		System.out.println();
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Linear Congruence");
		System.out.println("We will calculate a sequence of psuedorandom numbers.");
		MainMenu();
		scan.close();

	}
	
	public static void MainMenu() throws Exception{
		
			
		System.out.println("R – Run 3 Simulations\r\n" + 						
				"S – Change Seed\r\n" + 
				"I – Change Increment\r\n" + 
				"U – Change Multiplier\r\n" + 
				"M – Change Modulus\r\n" + 
				"X – Exit\n");
		
						////// MENU SWITCH ////
		try {
			option = scan.nextLine().toUpperCase().charAt(0);					/// Switch case, allows user to run 3 simulations
																				/// and to change each parameter
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		switch (option) 
        {
            case 'R': LinearCongruence.GenerateRandNum();
            			MainMenu();
                     break;
            case 'S': ChangeSeed();
            			MainMenu();
                     break;
            case 'I':  ChangeInc();
            		MainMenu();
                     break;
            case 'U':  ChangeMult();
            			MainMenu();
                     break;
            case 'M':  ChangeMod();
            			MainMenu();
                     break;
            case 'X':  MainMenu();
                     break;
          
            default: System.out.println("Invalid option. Try again.");
                     MainMenu();
                     break;  
        }
		              
		
	}
	
	public static void ChangeSeed() throws Exception {
		
		System.out.println("Enter a new Seed (X to exit)");							// repeats this line when exiting for some reason
		try {		
			int newSeed = scan.nextInt();
			SetSeed(newSeed);
//			scan.reset();	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void ChangeInc() throws Exception{
		
		System.out.println("Enter a new Increment (X to exit)");
		try {		
			int newInc = scan.nextInt();
			SetInc(newInc);
//			scan.reset();	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void ChangeMult() throws Exception{
		
		System.out.println("Enter a new Multiplier (X to exit)");
		try {		
			int newMult = scan.nextInt();
			SetMult(newMult);
//			scan.reset();	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	
	public static void ChangeMod() throws Exception{
		
		System.out.println("Enter a new Modulus (X to exit)");
		try {		
			int newMod = scan.nextInt();
			SetMod(newMod);
//			scan.reset();	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} 
	}

}
