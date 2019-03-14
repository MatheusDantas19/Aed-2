import java.util.Scanner;
public class AreaVolume{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		double raio, pi=Math.PI;
		double area=0,volume=0;
		raio = leia.nextInt();
		area=pi*(raio*raio);
		volume = (4.0/3.0)*pi*(raio*raio*raio);
		System.out.print("Um circulo com raio de "+raio+"0 centimetros tem uma area de ");
		System.out.printf("%.2f",area);
		System.out.print(" centimetros quadrados.\n");
		System.out.print("Uma esfera com raio de "+raio+"0 centimetros tem um volume de ");
		System.out.printf("%.2f",volume);
		System.out.println(" centimetros cubicos.\n");
	}
}