import java.util.Arrays;
import java.util.Scanner;


public class index_eq_int {

	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(i==a[i])
			{
				System.out.println(a[i]);
			}
		}

	}

}
