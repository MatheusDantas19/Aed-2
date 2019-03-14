import java.util.Scanner;
public class PorcentagemAcerto{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0;
		int aux[]=new int[100];
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
		int vet[]=new int[cont];
		for(int i=0;i<cont;i++){
			vet[i]=aux[i];
		}
		int vet2[]=new int[cont];
		cont=0;
		while(oi==false){
			int aux2=leia.nextInt();
			if(aux2==-1){
				break;
			}
			vet2[cont] = aux2;
			cont++;
		}
		cont=0;
		for(int i=0;i<acum;i++){
			if(vet[i]==vet2[i]){
				cont++;
			}
		}
		resultado=((double)cont/(double)acum);
		resultado*=100;
		System.out.printf("%.2f\n",resultado);
	}
		
}