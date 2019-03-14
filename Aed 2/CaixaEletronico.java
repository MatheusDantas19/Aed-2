import java.util.Scanner;
public class CaixaEletronico{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num,nota50,nota10,nota2;
		nota50=nota10=nota2=0;
		num = leia.nextInt();
		if(num<0 || num%2!=0){
			System.out.println("Valor Invalido");
		}else{
		
			if(num>=50){
				nota50 = num/50;
				num = num -50*nota50;
			}
			if(num>=10){
				nota10 = num/10;
				num = num -10*nota10;
			}
			if(num>=2){
				nota2 = num/2;
				num = num -2*nota2;
			}
			//if(num<2) break;
		
			System.out.println(nota50+" notas de R$50, "+nota10+" notas de R$10 e "+ nota2+" notas de R$2"); 
		}
	}
}