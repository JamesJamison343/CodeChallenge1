package com.challenges;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ChallengeTwo {
	
	public static BigInteger lookAndSay(BigInteger number) {
		
		if(number.toString().length() % 2 != 0) return new BigInteger("-1");
		
		String numberString = number.toString();
		char[] numberArray = numberString.toCharArray();
		
		List<String> pairList = new ArrayList<>();
		
		for(int i = 0; i < numberArray.length - 1; i += 2) {
			String newPair = "" + numberArray[i] + numberArray[i + 1] + "";
			pairList.add(newPair);
		}
		
		String resultString = "";
		
		for(String pair : pairList) {
			int number1 = Integer.valueOf("" + pair.charAt(0) + "");
			int number2 = Integer.valueOf("" + pair.charAt(1) + "");
			for(int i = 0; i < number1; i++) {
				resultString += "" + number2 + "";
			}
		}
		
		return new BigInteger(resultString);
	}
	
	
	public static void main(String[] args) {
		
		if(lookAndSay(new BigInteger("1213200012171979")).equals(new BigInteger("23002799999999"))) System.out.println("Test 1: Pass");
		else System.out.println("Test 1: Fail");
		
		if(lookAndSay(new BigInteger("54544666")).equals(new BigInteger("44444444446666666666"))) System.out.println("Test 2: Pass");
		else System.out.println("Test 2: Fail");
		
		if(lookAndSay(new BigInteger("95")).equals(new BigInteger("555555555"))) System.out.println("Test 3: Pass");
		else System.out.println("Test 3: Fail");
		
		if(lookAndSay(new BigInteger("1213141516171819")).equals(new BigInteger("23456789"))) System.out.println("Test 4: Pass");
		else System.out.println("Test 4: Fail");
		
		if(lookAndSay(new BigInteger("120520")).equals(new BigInteger("200"))) System.out.println("Test 5: Pass");
		else System.out.println("Test 5: Fail");
		
		if(lookAndSay(new BigInteger("231")).equals(new BigInteger("-1"))) System.out.println("Test 6: Pass");
		else System.out.println("Test 6: Fail");
		
	}
}
