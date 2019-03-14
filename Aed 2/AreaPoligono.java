import java.util.Scanner;
public class AreaPoligono{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0;
		double aux[]=new double[10];
		double resultado=0;
		boolean oi=false;
		while(oi==false){
			aux[cont]=leia.nextDouble();
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
		double vet2[]=new double[cont];
		cont=0;
		while(oi==false){
			double aux2=leia.nextDouble();
			if(aux2==-1){
				break;
			}
			vet2[cont] = aux2;
			cont++;
		}
		int i=0;
		while(i<=acum-2){
			resultado=(vet[i+1] + vet[i]) * (vet2[i+1]-vet2[i])+resultado;
			i++;
		}
		resultado = Math.abs(resultado)*1/2;
		System.out.printf("%.4f\n",resultado);
	}
		
}