package builderDesignPattern;

public class Main {

	
	/**
	 * The builder pattern, as name implies, is an alternative way to construct complex objects. 
	 * This should be used only when you want to build different 
	 * immutable objects using same object building process
	 * 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
	    User user1 = new User.UserBuilder("Lokesh", "Gupta")
	    .age(30)
	    .phone("1234567")
	    .address("Fake address 1234")
	    .build();
	 
	    System.out.println(user1);
	 
	    User user2 = new User.UserBuilder("Jack", "Reacher")
	    .age(40)
	    .phone("5655")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new User.UserBuilder("Super", "Man")
	    //No age
	    //No phone
	    //no address
	    .build();
	 
	    System.out.println(user3);
	}
}
