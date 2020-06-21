
public class Euclid {
	
	public static int gcd(int a, int b){
		if(a==0)
			return b;
		
		return gcd(b%a, a);
		
	}
	
	public static void main (String [] args){
		int a=61, b=2;
		System.out.println(gcd(a,b));
	}
}
