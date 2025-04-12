package automation;

import java.util.Scanner;

public class smallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Input number is: ");
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		
		else if(a<0){
		
			System.out.println("The number is negative");
			
		}
		
		else
		{
			System.out.println("The number is zzero");
		}
			
		

}
}
