import java.io.*;
public class Inverse extends Exception
{

     public static void main(String []args)
     {
        int ar[][]=new int[4][4];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the matrix : ");
        try{
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                ar[i][j]=Integer.parseInt(br.readLine());
            }
        }
        /*for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i!=j)
                {
                    System.out.println(ar[i][j]);
                }
            }
        }*/
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i!=j)
                {
                    ar[i][j]=(0-ar[i][j]);
                  
                }
            }
        
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("\t"+ar[i][j]);
            }
            System.out.println(" ");
        }
     }
}