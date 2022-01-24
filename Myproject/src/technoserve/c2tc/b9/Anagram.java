package technoserve.c2tc.b9;

import java.util.Arrays;
import java.util.Scanner;

 public class Anagram {
	 
	 private static Scanner input;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
	
		if(A.length()==B.length())
		{
			char[]charArray1=A.toCharArray();
			char[]charArray2=B.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result=Arrays.equals(charArray1,charArray2);
			if(result)
			{
				System.out.println(A+"and"+B+ "Anagram.");
			}
				else {
					
				System.out.println(A+"and"+B+ " not Anagram.");
				}
		
		}
	}
	
 }
		
		
		