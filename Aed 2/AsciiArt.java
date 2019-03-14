import java.util.Scanner;
public class AsciiArt{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int entrada = leia.nextInt();
		int i,j,k;
		for(int cont=1;cont<=2*entrada;cont++){
			System.out.print("*");
		}
		System.out.println();
		for(i=1;i<=entrada;i++){
			for(j=entrada-i;j>=1;j--){
				System.out.print("*");
			}
			for(k=1;k<=2*i-1;k++){
				if(k==1) System.out.print(" ");
				System.out.print(" ");
			}
			for(j=entrada-i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}