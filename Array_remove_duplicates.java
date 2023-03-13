//to remove duplicates
import java.util.Scanner;
class Array_remove_duplicates
{
  public static void main(String[] args)
  {
    int a[] = new int[50];
    int n,i,j;
    Scanner in = new Scanner(System.in);
    System.out.println("enter the no. of elements to be inserted :");
    n = in.nextInt();
    System.out.println("enter the array elements with duplicates");
    for(i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          a[j]=n-1;
          n--;
        }
      }
    }
    System.out.println("new array after removing duplicates :");
    for(i=0;i<n;i++)
    {
      System.out.println(" "+a[i]);
    }
  }
}
