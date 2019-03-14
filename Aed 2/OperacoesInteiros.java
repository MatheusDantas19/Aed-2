import java.util.Scanner;
public class OperacoesInteiros{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0;
		int num=0,pares=0,impa=0;
		int soma=0,maior=0,menor=999;
		int aux[]=new int[100];
		double resultado=0,media=0;
		boolean oi=false;
		while(oi==false){
			num=leia.nextInt();
			if(num==-1){
				for(int i =0;i<cont;i++){
					soma+=aux[i];
					if(aux[i]>maior) maior=aux[i];
					if(aux[i]<menor) menor=aux[i];
					if(aux[i]%2==0){
						pares++;
					}else{
						impa++;
					}
				}
				media=(double)soma/cont;
				System.out.println(cont);
				System.out.println(pares);
				System.out.println(impa);
				System.out.println(soma);
				System.out.printf("%.2f\n",media);
				System.out.println(maior);
				System.out.println(menor);
				num=leia.nextInt();
				if(num==-1){
					break;
				}else{
					cont=soma=pares=impa=maior=0;
					media=0;
					menor=999;
					aux[cont]=num;
					cont++;
				}
			}else{
				aux[cont]=num;
				cont++;
			}
		}
		
	}
		
}