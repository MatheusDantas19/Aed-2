import java.util.Scanner;
public class TanqueCombustivel{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		int raio,x,opcao;
		double calota,volume;
		double pi = Math.PI;
		raio=leia.nextInt();
		x=leia.nextInt();
		opcao=leia.nextInt();
		calota=(pi/3)*(x*x)*(3*raio-x);
		volume = 4.0/3 *pi*(raio*raio*raio);
		if(opcao==1){
			System.out.printf("%.4f\n",calota);
		}else{
			System.out.printf("%.4f\n",volume-calota);
		}
	}
}