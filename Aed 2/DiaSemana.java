import java.util.Scanner;
public class DiaSemana{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int nota=0,cont=0,freq=0,menos=0;
		int aux[]=new int[100];
		double resultado=0;
		boolean oi=false;
		while(oi==false){
			aux[cont]=leia.nextInt();
			if(aux[cont]==-1){
				break;
			}
			cont++;
		}
		int acum=0;
		int mat[][]= new int[4][7];
		for(int i =0;i<4;i++){
			for(int j=0;j<7;j++){
				mat[i][j]=aux[acum];
				acum++;
			}
		}
		int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0;
		for(int i=0;i<4;i++){
			s1+=mat[i][0];
			s2+=mat[i][1];
			s3+=mat[i][2];
			s4+=mat[i][3];
			s5+=mat[i][4];
			s6+=mat[i][5];
			s7+=mat[i][6];
		}
		int vet[] = new int[7];
		int maior=-99,cont2=0;
		int ind[]=new int[7];
		int j=0;
		vet[0]=s1;
		vet[1]=s2;
		vet[2]=s3;
		vet[3]=s4;
		vet[4]=s5;
		vet[5]=s6;
		vet[6]=s7;
		for(int i=0;i<7;i++){
			if(vet[i]>maior){
				maior=vet[i];
				ind[0]=i+1;
				j=i;
			}
		}
		cont2=1;			;
		for(int i=0;i<7;i++){
			//System.out.println(ind[1]);

			if(maior==vet[i] && i!=j){
				cont2++;
				if(cont2==2){
					ind[1]=i+1;
				}
				if(cont2==3){
					ind[2]=i+1;
				}
				if(cont2==4){
					ind[3]=i+1;
				}
				if(cont2==5){
					ind[4]=i+1;
				}
				if(cont2==6){
					ind[5]=i+1;
				}
				if(cont2==7){
					ind[6]=i+1;
				}
			}
			
		}
		for(int i=0;i<cont2;i++){
			System.out.println(ind[i]);
		}
		
	}
		
}