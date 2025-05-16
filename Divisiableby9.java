package loops2.java;

public class Divisiableby9 {
   public int getNumber(){
	   int count=0;
	   for(int i=1; i<=100;i++){
		   if(i%9==0){
			   System.out.println(i);
			   count++;
		   }  
	   }
	      return count;	      	
}
	public static void main(String[] args) {
		Divisiableby9 obj =new Divisiableby9();
		obj. getNumber();
		
	

	}

}
