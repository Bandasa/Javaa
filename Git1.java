package Practice;

public class Git1 {
	public void  add(int a , int b){
		System.out.print("Addition of two numbers ");
	System.out.println(a+b);
	
		}
	public void sub(int a,int b) {
		System.out.print("Subtraction of two numbers ");
		System.out.println(a-b);
	}
	public void mul(int a,int b) {
		System.out.println("Multiplication of two numbers " +a*b);
	}

	public static  void  main(String[] args){
		
		Git1 obj1= new Git1();
		obj1.add(10,20);
		obj1.sub(30, 20);
		obj1.mul(3, 4);
		
		
		
		
		

	}

}
