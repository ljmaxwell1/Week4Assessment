package model;

/**
 *Larry J Maxwell - ljmaxwell1@dmacc.edu
 *CIS175 - Spring 2022
 *Feb 11, 2022
 **/
public class NameSeperator {
	private String name;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public NameSeperator() {
		super();
	}
	
	public NameSeperator(String name) {
		super();
		this.name = name;
		setName(name);
		int b=0;
		String str = name;
		String[] arrOfStr = str.split(" ", 5);

		for (String a : arrOfStr) {
			if (b == 0) {
				this.firstName = a;
				setFirstName(firstName);
			}
			if (b == 1) {
				this.middleName = a;
				setMiddleName(middleName);
			}
			if (b == 2) {
				this.lastName = a;
				setLastName(lastName);
			}
			b=b+1;
		}

		
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//setName(name);
	}
	
	public void setNames(String tokens) {
		String[] tokens = name.split(" "); // split line on string separated by " "
		for(int i = tokens.length - 1; i >= 0; i--)
		    System.out.println(tokens[i]);
		
		
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "NameSeperator [name=" + name + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + "]";
	}
	
}
