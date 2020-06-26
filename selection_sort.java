
public class selection_sort {
	public static void main (String [] args){
		int array[]= {4,1,9,8,2,3};
		int length= array.length;
		
		for(int i=0; i<length-2; i++){
			int small=i;
			for(int j=i+1; j<length; j++){
				if(array[j]<array[small]){
					small=j;
				}
			}
			
			if(small!=i){
				int temp=array[i];
				array[i]=array[small];
				array[small]=temp;
			}
		}
		
		//display array
		for(int i=0;i<length; i++){
			System.out.println(array[i]);
		}
	}
}
