class Pattern10{
	public static void main(String args[]){
		int alphabet = 65;
		for(int i=4; i>=0; i--){
            for(int j=1; j<=i;j++){
				System.out.print(" ");
			}
			for(int k=i; k<=4; k++){
				System.out.print((char)(alphabet+k)+" ");
			}
			System.out.println();
		}
	}
}

