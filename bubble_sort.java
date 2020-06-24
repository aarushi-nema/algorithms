
public class bubble_sort {
	public static void main (String [] args){
		int [] array= {4,1,5,9,0,6,3,7,8,2};
		int length= array.length;
		
		for(int i=length-1; i>=0; i--){
			for(int j=0; j<=i-1; j++){
				if(array[j]>array[j+1]){
					int temp= array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		}
		
		for(int i=0; i<length; i++){
			System.out.println(array[i]);
		}
		
	}

}
