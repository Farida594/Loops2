package loops2.java;

public class Notdivisible {
	public static void notDivisable(){
		for(int i=1;i<100; i++){
			if(i%4!=0){
				System.out.println(i+"");
			}
			
		}
	}

	public static void main(String[] args) {
		Notdivisible obj =new Notdivisible();
		obj.notDivisable();
	}

}
