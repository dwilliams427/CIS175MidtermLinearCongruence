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

import java.util.Random;



public class LinearCongruence {
	static RandomNumberGenerator  GenX =  new RandomNumberGenerator();									// 3 iterations of the formula
	static RandomNumberGenerator  GenY =  new RandomNumberGenerator();
	static RandomNumberGenerator  GenZ =  new RandomNumberGenerator();
	static RandomNumberGenerator [] RandGenArray = new RandomNumberGenerator[3];
	

	public LinearCongruence() {
		// TODO Auto-generated constructor stub
		RandGenArray[0] = GenX;
		RandGenArray[1] = GenY;
		RandGenArray[2] = GenZ;
	}
	
	//
	public static void GenerateRandNum() {										
		for (int i =0; i < RandGenArray.length; i++) {
			System.out.println("Gen " + i + "\n\n");
			RandGenArray[i].RandGenerator();
			
			
		}
		
		
	}
	

	

}
