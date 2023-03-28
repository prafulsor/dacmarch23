class Pattern92{
public static void main(String args[]){

for(int i=1; i<=5; i++){

for (int j=i; j<=5; j++){
System.out.print(" ");
}

for (int k=1; k<=i; k++){
System.out.print("* ");
}
System.out.println();
}
for (int l=5; l<=1; l--){
	
	for (int m=1 ; m<=l; m++){
		System.out.print(" ");
	}
	for (int n=5; n>=l; n--){
		
	System.out.print("* ");
	}
System.out.println();
}}}




