package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		int m,n;
		m=100;	
		Customer c1=new Customer();
		c1.setcid(101);
		c1.setcname("Raja");
		c1.setcity("Puducherry");
		c1.setcphone(68933);
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setcid(102);
		c2.setcname("Priya");
		c2.setcity("Puducherry");
		c2.setcphone(32343);
		System.out.println(c2);

	}

}
