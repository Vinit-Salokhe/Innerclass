package innerclass.demo;

 class Outer_Demo {
	 
	void Method(){
	int num = 50;
		
		
		
 class Inner_Demo{
	
	void print(){
		System.out.println("This method is inner class"+" "+num);
	}
}
	Inner_Demo inner = new Inner_Demo(); 
	inner.print();


	}
	
	public static void main(String[]args){
		Outer_Demo outer = new Outer_Demo();
		outer.Method();
	}
}
