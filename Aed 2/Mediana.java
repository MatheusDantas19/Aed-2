import java.util.Scanner;
public class Mediana{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0;
		double aux[]=new double[100];
		double resultado=0;
		boolean oi=false;
		while(oi==false){
			aux[cont]=leia.nextInt();
			if(aux[cont]==-1){
				break;
			}
			cont++;
		}
		int acum=cont;
		double vet[]=new double[cont];
		for(int i=0;i<cont;i++){
			vet[i]=aux[i];
		}
		if(cont%2!=0){
			System.out.printf("%.1f\n",vet[cont/2]);
		}else{
			resultado = vet[(cont/2)-1] + vet[cont/2];
			resultado = resultado/2;
			System.out.printf("%.1f\n",resultado);
		}
		//System.out.printf("%.2f\n",resultado);
	}
		
}