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
	static LinearCongruence lg = new LinearCongruence();
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
	public static double GetSeed() {return seed;}
	public static void SetSeed(int s) {seed = s;}
	public static double GetMult() {return mult;	}
	public static void SetMult(int multi) {	mult = multi;}
	public static double GetInc() {	return inc;	}
	public static void SetInc(int i) {inc = i;}
	public static double GetMod() {	return mod;	}
	public static void SetMod(int m) {	mod = m;}
	
	
	public static void RandGenerator() {										//do the calculations, generate rand numbers, print them out
		for (int i =0; i < mod; i++) {
			result = (mult * seed + inc) % mod;
			System.out.println("Result #" + i + ": " +  result);
			seed = result;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Linear Congruence");
		System.out.println("We will calculate a sequence of psuedorandom numbers.");
//		System.out.println("Choose a seed numnber:");
	
//		SetSeed(scan.nextInt());												// user chooses seed number
//		
//		System.out.println("Here's your results:");
//		RandGenerator();
		
		LinearCongruence.GenerateRandNum();

	}

}
