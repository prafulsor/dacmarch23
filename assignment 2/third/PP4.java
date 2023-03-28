class PP4{

	public static void main(String args[]){
		int i,j,k,l;
		for(i=1;i<=9;i++){
			
			for(k=8;k>=i;k--){
				System.out.print("  ");
			}
		
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		
			for(l=i-1;l>=1;l--){
				
				System.out.print(l+" ");
			}
			System.out.println();
		}	
	
	}
}