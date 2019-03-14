import java.util.Scanner;
public class NumeroNeperiano{

	public static double fat(double	 n){
		if(n==1) return 1;
		return n*fat(n-1);
	}
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		int i;
		double raiz=1,x=1;
		num=leia.nextInt();
		if(num==0){ System.out.printf("%.6f\n",raiz);
		}
		else{
			for(i=1;i<num;i++){
				double res = fat(i);
				x+=1.0/res;
			}
			System.out.printf("%.6f\n",x);
		}
		
	}
}