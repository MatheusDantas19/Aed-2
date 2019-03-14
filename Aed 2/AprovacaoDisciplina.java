import java.util.Scanner;
public class AprovacaoDisciplina{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0,freq=0,menos=0;
		double aux[]=new double[100];
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
		freq=leia.nextInt();
		int emp=0,vit=0,derr=0;
		for(int i=0;i<acum;i++){
			if((vet[i]>=5) && (vet2[i]>=0.75*freq)){
				vit++;
			}
			else if((vet[i]<5) && (vet2[i]>=0.75*freq)){
				emp++;
			}else{
				derr++;
			}
		}
		System.out.println(vit+" "+emp+" "+derr);
	}
		
}