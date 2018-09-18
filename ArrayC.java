public class ArrayC{

     public static void main(String []args){
        int arr[]={20,56,67,84,56,72,20,84,100};
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        System.out.println("Number of duplicate entries found : "+flag);
     }
}