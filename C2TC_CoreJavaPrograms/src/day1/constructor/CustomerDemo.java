package day1.constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		//Customer c1=new Customer();
		//System.out.println(c1);// while printing the  object toString() is called
		
		Customer c2=new Customer(102,"swathi","japan");
		System.out.println(c2);
		
		Customer c3=new Customer("swathi","japan");
		System.out.println(c3);

	}

}
