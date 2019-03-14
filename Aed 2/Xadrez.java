import java.util.Scanner;
public class Xadrez{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int qtd,oi=0	;
		qtd=leia.nextInt();
		for(int i=0;i<qtd;i++){
			if(i==0){
				System.out.print("*");
				System.out.print(" ");
				for(int j=1;j<qtd;j++){
					System.out.print("*");
					System.out.print(" ");
				}
			}
			if(i%2!=0){
				System.out.print(" ");
				System.out.print("*");
				for(int j=1;j<qtd;j++){
					System.out.print(" ");
					System.out.print("*");
				}
			}
			if(i%2==0 && i>0){
				System.out.print("*");
				System.out.print(" ");
				for(int j=1;j<qtd;j++){
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}