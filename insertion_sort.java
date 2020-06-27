
public class insertion_sort {
	public static void main (String [] args){
		int [] array= {4,2,8,6,1,0};
		int length=array.length;
		
		for(int i=1; i<length; i++){
			int temp=array[i];
			int j=i-1;
			while(j>=0 && array[j]>temp){
				array[j+1]= array[j];
				j--;
			}
			
			array[j+1]= temp;
		}
		
		
		//print array
		for(int i=0; i<length; i++){
			System.out.println(array[i]);
		}
	}

}
