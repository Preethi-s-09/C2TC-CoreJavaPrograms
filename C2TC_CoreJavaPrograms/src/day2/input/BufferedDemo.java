package day2.input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) throws Exception { // exception declared using throw keyword
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String name;
		System.out.println("Enter the name:");
		name=br.readLine();
		
		int age;
		System.out.println("Eneter the age:");
		age=Integer.parseInt(br.readLine());
		
		float avg;
		System.out.println("Enter the avg:");
		avg =Float.parseFloat(br.readLine());
		
		System.out.println("Name"+name+"age"+ age+"avg"+ avg);
		

	}

}
