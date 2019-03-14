import java.util.Scanner;
public class Desconto{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		double preco,oi=0	;
		preco=leia.nextDouble();
		if(preco>=200.00){
			oi=(preco/100)*5;
			preco=preco-oi;
			System.out.printf("%.2f\n", preco);
		}else{
			System.out.printf("%.2f\n", preco);
		}
		
		
	}
}