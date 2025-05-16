package loops2.java;

public class Multiple {
    public static void printMultiples(int num1) {
    	for(int i=1; i<=10;i++) {
    		System.out.println(num1*i);
    		
    	}
    }
	public static void main(String[] args) {
		Multiple obj =new Multiple();
		obj.printMultiples(7);
		
		

	}

}
