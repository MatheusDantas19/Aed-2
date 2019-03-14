import java.util.Scanner;
public class SomaColecao{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num=0,soma=0;
		while(num!=-1){
			num=leia.nextInt();
			if(num==-1) break;
			soma+=num;
		}
		System.out.println(soma);
	}
}