package practicePrograms;


import org.checkerframework.common.value.qual.StaticallyExecutable;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	static Faker faker;
	static String fName;
	static String lName;
	static String email;
	static String phoneNumber;
	static String address4;

	public static String getFName(){
		faker=new Faker();
		String fName = faker.name().firstName();
		return fName;
	}

	public static String getEmail(){
		faker = new Faker();
		return faker.internet().emailAddress();
	}

	public static String getPhoneNumber(){
		faker=new Faker();
		phoneNumber = faker.phoneNumber().phoneNumber();

		return phoneNumber;
	}

	public static String getAddress()
	{
		faker=new Faker();
		address4=faker.address().fullAddress();
		return address4;
	}

	public static String getLName(){
		faker=new Faker();
		lName = faker.name().lastName();
		return lName;
	}



	public static void main(String args[])
	{
		String k=RandomDataUtility.getEmail();
		System.out.println(k);
		String n=RandomDataUtility.getFName();
		System.out.println(n); 
		String ln=RandomDataUtility.getLName();
		System.out.println(ln); 
		String address=RandomDataUtility.getAddress();
		System.out.println(address); 
		String phNo=RandomDataUtility.getPhoneNumber();
		System.out.println(phNo); 
		
	}


}
