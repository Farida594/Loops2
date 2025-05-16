package loops2.java;

public class Odd {
	public static void printOddSum(){
		int count =0;
		for (int i=1;i<30;i++) {
			if(i%2!=0) {
				count +=i;
				
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Odd obj =new Odd();
		obj. printOddSum();
		
		

	}

}
