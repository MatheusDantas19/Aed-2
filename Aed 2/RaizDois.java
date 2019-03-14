import java.util.Scanner;
public class RaizDois{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		int i;
		double raiz=0,x=1;
		num=leia.nextInt();
		for(i=0;i<num;i++){
			x=1/(2+x);
			raiz = x+1;
			System.out.printf("%.14f\n",raiz);
		}
	}
}