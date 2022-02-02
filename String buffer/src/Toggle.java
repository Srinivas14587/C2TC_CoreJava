import java.util.Scanner;

public class Toggle 
{
public static void main(String args[]) 
{
Scanner sc= new Scanner(System.in);
String A=sc.nextLine();
StringBuffer sb=new StringBuffer(A);
for(int i=0;i<A.length();i++)
{
	char ch=A.charAt(i);
	if(ch>='A' && ch<='Z')
	{
		ch=(char)((int)ch+32);
		sb.setCharAt(i,ch);
	}
	else
		if(ch>='a' && ch<='z')	
	{
		ch=(char)((int)ch-32);
		sb.setCharAt(i,ch);
	}
}
    System.out.println(sb);
    sc.close();
}
  }
 
 
 
