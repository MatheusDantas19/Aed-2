import java.util.Scanner;
public class DataExtenso{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int data;
		int ano=0,mes=0,dia=0;
		data=leia.nextInt();
		ano = data%10000;
		data/=10000;
		mes = data%100;
		data/=100;
		dia = data%100;
		if(mes==1){
			System.out.println(dia + " de janeiro de "+ano);
		}
		if(mes==2){
			System.out.println(dia + " de fevereiro de "+ano);
		}
		if(mes==3){
			System.out.println(dia + " de março de "+ano);
		}
		if(mes==4){
			System.out.println(dia + " de abril de "+ano);
		}
		if(mes==5){
			System.out.println(dia + " de maio de "+ano);
		}
		if(mes==6){
			System.out.println(dia + " de junho de "+ano);
		}
		if(mes==7){
			System.out.println(dia + " de julho de "+ano);
		}
		if(mes==8){
			System.out.println(dia + " de agosto de "+ano);
		}
		if(mes==9){
			System.out.println(dia + " de setembro de "+ano);
		}
		if(mes==10){
			System.out.println(dia + " de outubro de "+ano);
		}
		if(mes==11){
			System.out.println(dia + " de novembro de "+ano);
		}
		if(mes==12){
			System.out.println(dia + " de dezembro de "+ano);
		}
	}
}