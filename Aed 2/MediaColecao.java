import java.util.Scanner;
public class MediaColecao{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		double num=0,soma=0,stop=0;
		int cont=0;
		double media=0;
		while(stop==0){
			num=leia.nextInt();
			if(num==-1){
				break;
			}
			cont++;
			soma+=num;
		}
		media = soma/cont;
		System.out.printf("%.2f\n",media);
	}
}