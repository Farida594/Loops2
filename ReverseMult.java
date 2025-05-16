package loops2.java;

public class ReverseMult {
	public static void  getMultiply(int num){
		for(int i=10; i>=1; i--) {
			System.out.println(num+"*"+i+"="+(num*i));
	}	
	}

	public static void main(String[] args) {
		ReverseMult obj =new  ReverseMult();
		obj.getMultiply(6);
		
	}

}
