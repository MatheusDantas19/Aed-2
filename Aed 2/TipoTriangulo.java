#include <iostream>
using namespace std;
int main()
	int a,b,c;
	cin>>a;
	cin>>b;
	cin>>c;
		if(a < b + c && b < a + c && c < a + b){
			if(a==b && a==c) System.out.println("equilatero");
			else if (a!=b && a!=b && a!=c) System.out.println("escaleno");
			else System.out.println("isoceles"); 
		} 
		else{
			System.out.println("invalido");
		}
	}
}
