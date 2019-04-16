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

public class LinearCongruence {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
//	static RandomNumberGenerator  GenX =  new RandomNumberGenerator();									// 3 iterations of the formula
//	static RandomNumberGenerator  GenY =  new RandomNumberGenerator();
//	static RandomNumberGenerator  GenZ =  new RandomNumberGenerator();
//	static RandomNumberGenerator [] RandGenArray = new RandomNumberGenerator[3];
	
	static private int result = 0;
	static private int seed =1;
	static private int mult = 40;
	static private int inc = 3641;
	static private int mod = 729;
	

	public LinearCongruence() {
		// TODO Auto-generated constructor stub
		
	}
	public LinearCongruence(int s, int multi, int i, int m) {
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
	
	
//	public static void GenerateRandNum() {		
//		System.out.println("Your parameters are: \n"													//display developer defines parameters
//				+ "Seed: " + GenX.GetSeed() + "\n"
//						+ "Multiplier: " + GenX.GetMult() + "\n"
//								+ "Increment: " + GenX.GetInc() + "\n"
//										+ "Modulus: " + GenX.GetMod() + "\n");
//		
//		for (int i =0; i < RandGenArray.length; i++) {
//			System.out.println("Gen " + counter + "\n");
//			RandGenArray[i].RandGenerator();
//			counter++;
//		}			
//	}
}