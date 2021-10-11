class AdditionMatrixs
{
	public static void main(String args[]){
	int A[][]={{1,3}, {2,4}};
	int B[][]={{4,6}, {5,7}};
	int K[][]= new int[2][2];
	for(int i=0; i<2; i++){
	for(int j=0; j<2; j++){
	K[i][j] =(A[i][j]+B[i][j]);
	System.out.print(K[i][j]+" ");	}
	System.out.println();		}
	
	}
}