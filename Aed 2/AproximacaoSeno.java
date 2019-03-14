import java.util.Scanner;
public class AproximacaoSeno{

	public static double fat(double	 n){
		if(n==1) return 1;
		return n*fat(n-1);
	}
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		double seno=0,x;
		x=leia.nextDouble();
		num=leia.nextInt();
		double radians = Math.toRadians(x);
		//seno = radians;
		for(int i=0;i<num;i++){
			double res = fat(2*i+1);
			if(i%2!=0){
				seno+=Math.pow(-1,i)*Math.pow(radians,2*i+1) / res;
			}else{
				seno+=Math.pow(-1,i)*Math.pow(radians,2*i+1) / res;
			}
			System.out.printf("%.10f\n",seno);
		}
		

		
		

	}
}