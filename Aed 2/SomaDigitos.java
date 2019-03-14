import java.util.Scanner;
public class SomaDigitos{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int a,b=0	,c;
		double s=0;
		a=leia.nextInt();
		while(a!=0){
			b+=a%10;
			a=a/10;
		}
		System.out.println(b);
	}
}