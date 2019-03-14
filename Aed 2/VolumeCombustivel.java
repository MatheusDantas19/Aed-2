import java.util.Scanner;
public class VolumeCombustivel{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		int num;
		int h,r,n;
		double vol=0;
		double pi = Math.PI;
		h=leia.nextInt();
		r=leia.nextInt();
		n=leia.nextInt();
		if(h<0 || n<0 || r<0){
			vol=-1;
		}else if(n<r){
			vol=(pi/3)*(n*n)*(3*r-n);
		}else if(n<h-r){
			vol=(2.0/3)*(pi)*(r*r*r)+pi*(r*r)*(n-r);			
		}else if(n<=h){
			vol=4.0/3 *pi*(r*r*r) + pi*(r*r)*(h-2*r)-(1.0/3)*pi*(h-n)*(h-n)*(3*r-h+n);
		}
		System.out.printf("%.3f\n",vol);
	}
}