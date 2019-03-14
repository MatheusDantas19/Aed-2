import java.util.Scanner;
public class PontoReta{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		double x=0,y=0;
		x=leia.nextDouble();
		y=leia.nextDouble();
		if(((2*(x))+y)==3){
			System.out.println("Ponto ("+x+", "+y+") pertence a reta 2x + y = 3.");
		}else{
			System.out.println("Ponto ("+x+", "+y+") nao pertence a reta 2x + y = 3.");
		}
	}
}