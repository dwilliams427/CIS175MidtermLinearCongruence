import java.util.Random;
import java.util.Scanner;
/*
 * Name: Daniel Williams & Matthew Ambrose
 * Date: 03/28/19 --> 04/11/19
 * 
 * 
 * 
 * @version 2.0
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
	static private LinearCongruence GenX =  new LinearCongruence();									// 3 iterations of the formula
	static private LinearCongruence GenY =  new LinearCongruence();	
	static private LinearCongruence GenZ =  new LinearCongruence();	
	static private LinearCongruence [] RandGenArray = new LinearCongruence[3];
	static private char option = 'x';
	static private int counter = 1;
	

	public RandomNumberGenerator() {
		// TODO Auto-generated constructor stub
		RandGenArray[0] = GenX;																			//add each object to an array
		RandGenArray[1] = GenY;
		RandGenArray[2] = GenZ;
	}
//	public RandomNumberGenerator(int s, int multi, int i, int m) {
//		// TODO Auto-generated constructor stub
//		seed = s;
//		 mult = multi;
//		 inc = i;
//		 mod = m;
//	}
	
//	// GETTERS/SETTERS vvvvv //
//	public static double GetSeed() {return seed;}								//GETTERS/SETTERS
//	public static void SetSeed(int s) {seed = s;}
//	public static double GetMult() {return mult;	}
//	public static void SetMult(int multi) {	mult = multi;}
//	public static double GetInc() {	return inc;	}
//	public static void SetInc(int i) {inc = i;}
//	public static double GetMod() {	return mod;	}
//	public static void SetMod(int m) {	mod = m;}
	
	
//	public static void RandGenerator() {										//do the calculations, generate random numbers, print out each result
//		for (int i =0; i < mod; i++) {
//			result = (mult * seed + inc) % mod;
//			System.out.println("Result #" + i + ": " +  result);
//			seed = result;
//		}
//		System.out.println();
//		
//		
//	}

	
	
	public static void MainMenu() throws Exception{
		
			
		System.out.println("==================================\n"
				+ "R – Run 3 Simulations\r\n" + 						
				"S – Change Seed\r\n" + 
				"I – Change Increment\r\n" + 
				"U – Change Multiplier\r\n" + 
				"M – Change Modulus\r\n" + 
				"X – Exit\n"
				+ "==================================\n");
		
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
            case 'R': GenerateRandNum();
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
		
		System.out.println("Enter a new Seed (X to exit)");							// TODO: fix this: repeats this line when exiting for some reason
		try {		
			int newSeed = scan.nextInt();
			for (int i =0; i < RandGenArray.length; i++) {							// sets user's number to new Seed for each Simulation object
				RandGenArray[i].SetSeed(newSeed);
				counter++;
			}	
			counter = 0;															//reset simulation counter
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
			for (int i =0; i < RandGenArray.length; i++) {
				RandGenArray[i].SetInc(newInc);
				counter++;
			}	
			counter = 0;
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
			for (int i =0; i < RandGenArray.length; i++) {
				RandGenArray[i].SetMult(newMult);
				counter++;
			}	
			counter = 0;
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
			for (int i =0; i < RandGenArray.length; i++) {
				RandGenArray[i].SetMod(newMod);
				counter++;
			}	
			counter = 0;
//			scan.reset();	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} 
	}
	
	public static void GenerateRandNum() {		
		System.out.println("Your parameters are: \n"													//display developer defines parameters
				+ "Seed: " + GenX.GetSeed() + "\n"
						+ "Multiplier: " + GenX.GetMult() + "\n"
								+ "Increment: " + GenX.GetInc() + "\n"
										+ "Modulus: " + GenX.GetMod() + "\n");
		
		for (int i =0; i < RandGenArray.length; i++) {
			System.out.println("Gen " + counter + "\n");
			RandGenArray[i].RandGenerator();
			counter++;
		}
		counter =0;
	}
	
//	private static void printRowOutlined(String left, int right) {
//	    System.out.printf("%-15s%03d%n", left, right);
//	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Linear Congruence");
		System.out.println("We will calculate a sequence of psuedorandom numbers.");
		MainMenu();
		scan.close();

	}
}