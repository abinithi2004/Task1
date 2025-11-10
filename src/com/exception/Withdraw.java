package com.exception;
import java.util.Scanner;
public class Withdraw {
Scanner sc=new Scanner(System.in);
   System.out.println("Enter the amount");
   int amt=sc.nextInt();
	if(amt>=10000) {
		System.out.println("To withdraw amount: "+amt);
	}
	else {
            throw new Exception("Amount must be at least ₹10,000 to withdraw.");
        }
    } catch (Exception e) {
        System.out.println("Withdrawal Error: " + e.getMessage());
    }


}
}
