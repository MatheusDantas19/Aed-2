import java.util.Scanner;
public class SomaColecoes{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num=0,soma=0,stop=0;
		while(stop==0){
			num=leia.nextInt();
			if(num==-1){
				System.out.println(soma);
				num=leia.nextInt();
				if(num==-1){
					stop = 1;
					break;
				}else{
					soma=0;
				}
			}
			soma+=num;
		}
		
	}
}