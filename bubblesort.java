import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
   int arr[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       arr[i]=S.nextInt();
   }
   for(int i=0;i<n-1;i++)
   {
       for(int j=0;j<n-1-i;j++)
       {
           if(arr[j]>arr[j+1])
           {
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
           }
       }
   }
   for(int i=0;i<n;i++)
   {
       
   System.out.println(arr[i]);
   }
}
}