import java.util.Scanner;
public class AproximacaoPi{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		int i;
		double raiz=0,x=0,ap=3;
		num=leia.nextInt();
		System.out.printf("%.6f\n",ap);
		int z=2;
		int j=3;
		int k=4;
		for(i=1;i<num;i++){
			if(i%2!=0){
				ap=ap+(4.0)/(z*j*k);
			}else{
				ap=ap-(4.0)/(z*j*k);
			}
			z+=2;
			j+=2;
			k+=2;
			System.out.printf("%.6f\n",ap);

		}
	}
}