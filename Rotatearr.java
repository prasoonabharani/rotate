import java.util.*;
class Rotatearr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size =");
int n=sc.nextInt();
int r= sc.nextInt();
int arr[]= new int[n];
int brr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if((i-r)<0)
{
brr[i]=arr[n+i-r];
}
else
brr[i-r]=arr[i];
}
for(int i=0;i<n;i++)
{
System.out.print(brr[i]+" ");
}
}}