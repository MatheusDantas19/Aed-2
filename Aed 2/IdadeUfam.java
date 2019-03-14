import java.util.Scanner;
public class IdadeUfam{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int ano;
		ano = leia.nextInt();
		System.out.println("A UFAM tem "+(ano-1909)+ " anos de fundacao");
	}
}