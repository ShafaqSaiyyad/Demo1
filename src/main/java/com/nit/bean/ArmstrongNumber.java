package com.nit.bean;

import org.springframework.stereotype.Component;
@Component("arm")
public class ArmstrongNumber {
	
	
	public void isArmstrong(int num) {
		int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        if(originalNumber==sum)
        	System.out.println(originalNumber+" is Armstrong.");
        else {
        	System.out.println(originalNumber+" is not Armstrong.");
        }
	}

}
