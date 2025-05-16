package loops2.java;

public class Even {
	public static int getEvenNumbers(){
		int count=0;
		for(int i=1; i<=50;i++){
			if(i%2==0){
				count=count+1;
				
			}
		}	
			return count;
		}

	public static void main(String[] args) {
	Even obj =new Even();
	System.out.println(obj.getEvenNumbers());
	
	

	}

}
