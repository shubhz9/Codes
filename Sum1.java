import java.io.*;
public class Sum1 extends Exception
{

     public static void main(String []args){
        int arr[]=new int[8];
        int ar[][]=new int[8][2];
        int s=0,c=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enetr the sum for you have to find pairs : ");
        s=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==s)
                {
                    System.out.println("("+arr[i]+","+arr[j]+") ");
                    ar[c][0]=arr[i];
                    ar[c++][1]=arr[j];
                }
            }
        }
        
     }
}