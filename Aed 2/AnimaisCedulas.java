import java.util.Scanner;
public class AnimaisCedulas{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int n;
		n=leia.nextInt();
		if(n==2) System.out.println("Tartaruga");
		else if(n==5) System.out.println("Garça");
		else if(n==10) System.out.println("Arara");
		else if(n==20) System.out.println("Mico-Leão-Dourado");
		else if(n==50) System.out.println("Onça-Pintada");
		else if(n==100) System.out.println("Garoupa");
		else System.out.println("erro");

	}
}