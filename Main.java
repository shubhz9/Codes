/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String str="JamchaShubhya";
		str+='\0';
		char strr[]=str.toCharArray();
		int count=0;
		while(strr[count]!='\0')
		    count++;
		for(int i=(count/2);i<count;i++)
		    System.out.println(strr[i]+" ");
		    
		
		for(int i=(count/2);i>0;)
		    System.out.println(strr[--i]+" ");
	}
}
