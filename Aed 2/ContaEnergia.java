import java.util.Scanner;
public class ContaEnergia{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		double preco;
		double resultado;
		preco=leia.nextDouble();
		char tipo = leia.next().charAt(0);
		if(tipo=='R'){
			if(preco<=500 && preco>=0){
				resultado=preco*0.40;
				System.out.printf("%.2f\n", resultado);
			}else if(preco>500){
				resultado=preco*0.65;
				System.out.printf("%.2f\n", resultado);
			}else{
				System.out.println("-1.00");
			}
		}else if(tipo=='C'){
			if(preco<=1000 && preco>=0){
				resultado=preco*0.55;
				System.out.printf("%.2f\n", resultado);
			}else if(preco>1000){
				resultado=preco*0.60;
				System.out.printf("%.2f\n", resultado);
			}else{
				System.out.println("-1.00");
			}	
		}else if(tipo=='I'){
			if(preco<=5000 && preco>=0){
				resultado=preco*0.55;
				System.out.printf("%.2f\n", resultado);
			}else if(preco>5000){
				resultado=preco*0.60;
				System.out.printf("%.2f\n", resultado);
			}else{
				System.out.println("-1.00");
			}
		}else{
			System.out.println("-1.00");
		}

	}
		
}