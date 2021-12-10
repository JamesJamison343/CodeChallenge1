package com.challenges;

public class ChallengeOne {
	
	public static int lcmOfArray(int[] numbers) {
		
		int lcm = 1;
		boolean isLcm = false;
		
		while(isLcm == false) {
			for(int number : numbers) {
				if(lcm % number != 0) {
					lcm++;
					break;
				}
				if(number == numbers[numbers.length - 1]) isLcm = true;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
		
		if(lcmOfArray(new int[] {5, 4, 6, 46, 54, 12, 13, 17}) == 2744820) System.out.println("Test 1: Pass");
		else System.out.println("Test 1: Fail");
		
		if(lcmOfArray(new int[] {46, 54, 466, 544}) == 78712992) System.out.println("Test 2: Pass");
		else System.out.println("Test 2: Fail");
		
		if(lcmOfArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) == 2520) System.out.println("Test 3: Pass");
		else System.out.println("Test 3: Fail");
		
		if(lcmOfArray(new int[] {13, 6, 17, 18, 19, 20, 37}) == 27965340) System.out.println("Test 4: Pass");
		else System.out.println("Test 4: Fail");
	
	}

}
