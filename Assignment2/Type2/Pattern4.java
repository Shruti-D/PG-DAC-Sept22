class Pattern4{
	public static void main(String args[]){
		for(int i=1; i<=5; i++){
			for(int j=5; j>5-i;j--){
				System.out.print(" ");
			}
			for(int k=5;k>=i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}