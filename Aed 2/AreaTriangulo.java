import java.util.Scanner;
public class AreaTriangulo{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		double s=0;
		a=leia.nextInt();
		b=leia.nextInt();
		c=leia.nextInt();
		s=(a+b+c)/2;
		if(a < b + c && b < a + c && c < a + b){
			System.out.printf("%.2f\n",Math.sqrt((s*(s-a)*(s-b)*(s-c))));
		} 
		else{
			System.out.println("Triangulo Invalido");
		}
	}
}