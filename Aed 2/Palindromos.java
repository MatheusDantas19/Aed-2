import java.util.Scanner;
public class Palindromos	{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		String palavra;
		palavra = leia.nextLine();
		int e=0;
		//int d = palavra.length()-1;
		boolean pali = true;
		palavra = palavra.replace(" ","");
		String palavraM;
		palavraM = palavra.toUpperCase();
		int d = palavraM.length()-1;
		while(e<=d){
			if(palavraM.charAt(e)!=palavraM.charAt(d)){
				pali=false;
			}
			e++;
			d--;
		}
		
		if(pali==true){
			System.out.println(palavraM +" 1");
		}else{
			System.out.println(palavraM +" 0");
		}

	}
}