import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==1||n==2) System.out.println(1);
		else{
			int a=1,b=1,count=0;
			for(int i=3;i<=n;i++){
				count=a+b;
				a=b;
				b=count;
			}
			System.out.println(count);
		}
	}
}
